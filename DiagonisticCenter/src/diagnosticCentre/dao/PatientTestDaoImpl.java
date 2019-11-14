package diagnosticCentre.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import diagnosticCentre.entity.PatientTest;
import diagnosticCentre.exceptions.DBUtilException;
import diagnosticCentre.exceptions.DaoException;

public class PatientTestDaoImpl implements PatientTestDao {
	private String sql = "";

	@Override
	public boolean insertTestRecords(PatientTest patientTestDetails) throws DaoException {
		int result = 0;
		sql = "insert into Patient_Test Values (?,?,?)";

		try {
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			System.out.println("patientTestDetails.getPid() :" + patientTestDetails.getPid()
					+ "\r\npatientTestDetails.getTid() : " + patientTestDetails.getTid() + " ");
			ps.setInt(1, patientTestDetails.getPid());
			ps.setInt(2, patientTestDetails.getTid());
			ps.setDate(3, new Date(patientTestDetails.getDate().getTime()));
			result = ps.executeUpdate();
		} catch (SQLException | DBUtilException e) {
			throw new DaoException(e);
		}
		if (result == 1)
			return true;
		else
			return false;
	}

	@Override
	public boolean insertTestRecords(List<PatientTest> PatientTestDetails) throws DaoException {
		int[] count = new int[PatientTestDetails.size()];
		sql = "insert into Patient_Test Values (?,?,?)";
		for (PatientTest patientTestDetail : PatientTestDetails)
			System.out.println(patientTestDetail.getPid() + " " + patientTestDetail.getTid() + " ");
		try {
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			for (PatientTest patientTest : PatientTestDetails) {
				ps.setInt(1, patientTest.getPid());
				ps.setInt(2, patientTest.getTid());
				ps.setDate(3, new Date(patientTest.getDate().getTime()));
				ps.addBatch();
			}
			count = ps.executeBatch();
		} catch (SQLException | DBUtilException ex) {
			throw new DaoException(ex);
		}
		if (count.length == PatientTestDetails.size())
			return true;
		else
			return false;
	}

}
