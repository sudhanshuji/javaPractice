package playerAuctionSystem.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import playerAuctionSystem.dao.DBUtil;

public class TeamManagerImpl implements TeamManager {
	String sql="";
	public boolean validateTeamName(String teamName) {
		Set<String> teamsName=new HashSet<>();
		sql="select team_name from team;";
		try {
			Connection conn=DBUtil.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				teamsName.add(rs.getString(1).toLowerCase());
				teamsName.add(rs.getString(1).toUpperCase());
			}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (teamsName.contains(teamName)) {
			return true;
		}
		else
			return false;
	}
	@Override
	public Map<String, String> displayPlayers(String teamName) {
		Map<String, String> playerSpecification=new TreeMap<String, String>();
		//sql="select "
		return null;
	}
}
