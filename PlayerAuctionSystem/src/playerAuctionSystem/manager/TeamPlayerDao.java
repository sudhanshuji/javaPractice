package playerAuctionSystem.manager;

import java.util.Set;

public interface TeamPlayerDao {
     public Set<Integer> fetchPlayerNo();
     public int getPlayerNo(int teamId);
     public boolean insertPlayerNo(Set<Integer> playerNumberSet);
}
