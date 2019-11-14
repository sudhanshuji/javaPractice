package players.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PlayersData {
	private static final String DBDriver = "com.mysql.cj.jdbc.Driver";
	private static final String DBURL = "jdbc:mysql://localhost:3306/playerData";
	private static final String DBUsername = "root";
	private static final String dbPassword = "0225";
	private static String querry = "select playerName from players where countryID=1";

	public static void main(String args[]) {
		Connection conn = null;
		java.sql.Statement st = null;
		try {
			// Register the JDBC driver
			Class.forName(DBDriver);

			// Open the connection
			conn = DriverManager.getConnection(DBURL, DBUsername, dbPassword);
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(querry);
			while (rs.next()) {
				String name = rs.getString("playerName");
				System.out.println(name);
			}
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
