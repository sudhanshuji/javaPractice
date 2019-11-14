package diagnosticCentre.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import daiagnosticCentre.dto.ReportDto;
import diagnosticCentre.entity.Test;
import diagnosticCentre.exceptions.DBUtilException;
import diagnosticCentre.exceptions.DaoException;
import diagnosticCentre.exceptions.InvalidEmailIdException;

public class PatientDaoImpl implements PatientDao {
	private String sql = "";

	@Override
	public int getPidByEmail(String emailId) throws DaoException {
		int pId = 0;
		sql = "select P_ID from Patient where Email = '" + emailId + "'";
		try {
			Connection conn = DBUtil.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				pId = rs.getInt(1);
			}
		} catch (DBUtilException | SQLException e) {
			// TODO Auto-generated catch block
			throw new DaoException();
		}
		System.out.println(pId);
		return pId;
	}

	@Override
	public int getPidByPhone(String PhoneNo) throws DaoException {
		int pId = 0;
		sql = "select P_ID from Patient where Phone = '" + PhoneNo + "'";

		try {
			Connection conn = DBUtil.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				pId = rs.getInt(1);
			}
		} catch (DBUtilException | SQLException e) {
			// TODO Auto-generated catch block
			throw new DaoException();
		}

		return pId;
	}

	@Override
	public Set<String> getListOfEmail() throws DaoException {
		Set<String> listOfEmails = new HashSet<>();
		sql = "select email from patient";

		try {
			Connection conn = DBUtil.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				listOfEmails.add(rs.getString(1));
			}
		} catch (DBUtilException | SQLException e) {
			// TODO Auto-generated catch block
			throw new DaoException();
		}
		return listOfEmails;
	}

	@Override
	public Set<String> getListOfPhone() throws DaoException {
		Set<String> listOfPhones = new HashSet<>();
		sql = "select phone from patient";

		try {
			Connection conn = DBUtil.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				listOfPhones.add(rs.getString(1));
			}
		} catch (DBUtilException | SQLException e) {
			// TODO Auto-generated catch block
			throw new DaoException();
		}
		return listOfPhones;
	}

	@Override
	public String getPhoneByPid(int pId) throws DaoException {
		String phone = "";
		sql = "select phone from patient where P_ID = " + pId;
		try {
			Connection conn = DBUtil.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				phone = rs.getString(1);
			}
		} catch (DBUtilException | SQLException e) {
			// TODO Auto-generated catch block
			throw new DaoException();
		}
		return phone;
	}

	@Override
	public String getNameByPid(int pId) throws DaoException {
		String name = "";
		sql = "select Name from patient where P_ID = " + pId;
		try {
			Connection conn = DBUtil.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				name = rs.getString(1);
			}
		} catch (DBUtilException | SQLException e) {
			// TODO Auto-generated catch block
			throw new DaoException();
		}
		return name;
	}

	@Override
	public ReportDto  (String email, Date date) throws DaoException {

		ReportDto result = new ReportDto();
		List<Test> tests = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String dateObj = sdf.format(date);

		Date dateObj1 = null;
		try {
			dateObj1 = sdf.parse(dateObj);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(dateObj1);

		String dateStr = sdf.format(dateObj1);

		sql = "select Name,Phone,TestName,Cost from patient p inner join Patient_Test pt on p.P_ID=pt.P_ID inner join Test t on t.T_ID=pt.T_ID where Email = '"
				+ email + "' and Date = '" + dateStr + "'";
		try {
			Connection conn = DBUtil.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Test test = new Test();
				result.setName(rs.getString(1));
				result.setPhone(rs.getString(2));
				test.setTestName(rs.getString(3));
				test.setCost(rs.getInt(4));
				tests.add(test);
				result.setTest(tests);
			}
		} catch (DBUtilException | SQLException e) {
			// TODO Auto-generated catch block
			throw new DaoException();
		}
		return result;
	}

	@Override
	public ReportDto fetchTestDetailsForPatientByPhone(String phone, Date date) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

}
