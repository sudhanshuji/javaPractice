package diagnosticCentre.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import diagnosticCentre.exceptions.DBUtilException;
import diagnosticCentre.exceptions.DaoException;

public class TestDaoImpl implements TestDao {
 private String sql="";
	@Override
	public int getTidByTestName(String testName) throws DaoException {
		int tId=0;
		sql="select T_ID from Test where Name = '"+testName+"'";
		
		try {
			Connection conn=DBUtil.getConnection();
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				tId=rs.getInt(1);
			}
		} catch (SQLException | DBUtilException e) {
			throw new DaoException();
		}
	
		System.out.println(tId);
		return tId;
	}
	@Override
	public Set<String> getListOfTestNames() throws DaoException {
		Set<String> listOfTests = new HashSet<>();
		sql="select Name from test";
		try {
			Connection conn=DBUtil.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql) ;
			while(rs.next()) {
				listOfTests.add(rs.getString(1));
			}
		} catch (SQLException | DBUtilException e) {
			throw new DaoException();
		}		
		return listOfTests;
	}

}
