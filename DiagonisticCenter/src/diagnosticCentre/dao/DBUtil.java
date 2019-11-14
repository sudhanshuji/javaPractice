package diagnosticCentre.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import diagnosticCentre.exceptions.DBUtilException;


public class DBUtil {
	private static final String DBDriver = "com.mysql.cj.jdbc.Driver";
	private static final String DBURL = "jdbc:mysql://localhost:3306/Diagnostic_DB";
	private static final String DBUsername = "root";
	private static final String dbPassword = "0225";
	
	public static Connection getConnection() throws DBUtilException{
		Connection conn=null;
		try {
			Class .forName(DBDriver);
			conn=DriverManager.getConnection(DBURL, DBUsername, dbPassword);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			throw new DBUtilException();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DBUtilException();
			}
		
		return conn;
	}

}
