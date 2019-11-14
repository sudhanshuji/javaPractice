package playerAuctionSystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.mindtree.exceptions.DBUtilExceptions;

import playerAuctionSystem.entity.Team;

public class TeamDaoImpl implements TeamDao {
	String sql = "";
	String sql1="";
	@Override
	public int getTeamId(String teamName) {
		int teamId = 0;
		sql = "select Team_Id from Team where Team_Name = '" + teamName + "';";
		sql1="insert into Team_Player(Team_Id) "
				+ "Values (";
		try {
			Connection conn = DBUtil.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				teamId = rs.getInt(1);
				st.executeUpdate(sql1+rs.getInt(1)+",;");
			}
		} catch (DBUtilExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return teamId;
	}

	@Override
	public Map<String, String> getTeamDetails(int playerNo) {
		Map<String, String> TeamPlayersDeatails = new TreeMap<String, String>();
		sql = "select Player_Name,Category from Player where playerNo = '" + playerNo + "';";
		try {
			Connection conn = DBUtil.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				TeamPlayersDeatails.put(rs.getString(1), rs.getString(2));
			}
		} catch (DBUtilExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return TeamPlayersDeatails;
	}

}
