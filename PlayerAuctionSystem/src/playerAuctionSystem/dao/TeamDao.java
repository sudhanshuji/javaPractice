package playerAuctionSystem.dao;

import java.util.Map;

public interface TeamDao {

	public int getTeamId(String teamName);
	public Map<String, String> getTeamDetails(int playerNo);
}
