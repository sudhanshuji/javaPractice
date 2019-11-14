package playerAuctionSystem.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mindtree.exceptions.DBUtilExceptions;

public class DBUtil {
	
	private static final String DBDriver = "com.mysql.cj.jdbc.Driver";
	private static final String DBURL = "jdbc:mysql://localhost:3306/Player_DB";
	private static final String DBUsername = "root";
	private static final String dbPassword = "0225";
	
	public static Connection getConnection() throws DBUtilExceptions {
		Connection conn = null;
		try {
			Class.forName(DBDriver);
			conn = DriverManager.getConnection(DBURL, DBUsername, dbPassword);
			return conn;
		} catch (ClassNotFoundException e) {
			throw new DBUtilExceptions();
		} catch (SQLException e) {
			throw new DBUtilExceptions();
		}
	}

}
