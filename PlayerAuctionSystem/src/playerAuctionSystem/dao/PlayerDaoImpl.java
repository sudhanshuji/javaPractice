package playerAuctionSystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mindtree.exceptions.DBUtilExceptions;

import playerAuctionSystem.entity.Player;

public class PlayerDaoImpl implements PlayerDao {
	String sql="";
	
	public List<String> retrievePlayers(){
		List<String> players=new ArrayList<String>();
		sql="select Player_Name from Player;";
		
		try {
			Connection conn=DBUtil.getConnection();
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				players.add(rs.getString(1));
			}
		}catch (DBUtilExceptions e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return players;
		
	}
	@Override
	public boolean insertPlayers(Player playerDetails) {
		
		int result = 0;
		int count = 0;
		sql="insert into Player Values (?,?,?,?,?)";
		try {
			Connection conn=DBUtil.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);
			Statement st=conn.createStatement();
			ps.setInt(1,playerDetails.getPlayerNo());
			ps.setString(2,playerDetails.getPlayerName());
			ps.setString(3,playerDetails.getCategory());
			ps.setInt(4,playerDetails.getHighestScore());
			ps.setString(5,playerDetails.getBestFigure());
			result=ps.executeUpdate();
			ResultSet rs=st.executeQuery("select Player_No from Player where Player_Name = '"+playerDetails.getPlayerName()+"' ;");
			while(rs.next()) {
				count=rs.getInt(1);
			}
		} catch (DBUtilExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result==1) {
			System.out.println("Player added succesfully with player No :-"+count);
			return true;
		}
		else 
			return false;
		
	}

}
