package playerAuctionSystem.manager;

import java.util.Map;

public interface TeamManager {
	public boolean validateTeamName(String teamName);
	public Map<String, String> displayPlayers(String teamName);
}
