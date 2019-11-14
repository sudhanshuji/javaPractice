package student_record.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static final String DBDriver = "com.mysql.cj.jdbc.Driver";
	private static final String DBURL = "jdbc:mysql://localhost:3306/student_records";
	private static final String DBUsername = "root";
	private static final String dbPassword = "0225";

	public static Connection getConnection() throws Exception {
		Connection conn = null;
		try {
			Class.forName(DBDriver);
			conn = DriverManager.getConnection(DBURL, DBUsername, dbPassword);
			return conn;
		} catch (ClassNotFoundException e) {
			throw new Exception(e);
		} catch (SQLException e) {
			throw new Exception(e);
		}
	}

}
