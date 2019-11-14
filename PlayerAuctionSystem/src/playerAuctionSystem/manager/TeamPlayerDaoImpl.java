package playerAuctionSystem.manager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import com.mindtree.exceptions.DBUtilExceptions;

import playerAuctionSystem.dao.DBUtil;

public class TeamPlayerDaoImpl implements TeamPlayerDao {
    String sql="";
	
	@Override
	public Set<Integer> fetchPlayerNo() {
		Set<Integer> playerNumberSet= new HashSet<Integer>();
		sql="select Player_No from player;";
		try {
			Connection conn=DBUtil.getConnection();
			Statement st=conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				playerNumberSet.add(rs.getInt(1));
			}
			
			
		} catch (DBUtilExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public boolean insertPlayerNo(Set<Integer> playerNumberSet) {
		for(Integer playerNo:playerNumberSet) {
		sql="insert into team_player(player_No) Values "+playerNo+";";
		try {
			Connection conn=DBUtil.getConnection();
			Statement st=conn.createStatement();
			st.executeUpdate(sql);
		} catch (DBUtilExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		return false;
	}
	
	@Override
	public int getPlayerNo(int teamId) {
        int playerNo=0; 
		sql="select Player_No from Team_Player where Team_Id = '"+teamId+"' ;";
		try {
			Connection conn=DBUtil.getConnection();
			Statement st=conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				playerNo=rs.getInt(1);
			}
		}catch (DBUtilExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return playerNo;
	}
	

}
