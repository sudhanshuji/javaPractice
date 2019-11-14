package playerAuctionSystem.dao;

import java.util.List;

import com.mindtree.exceptions.InvalidCategoryException;

import playerAuctionSystem.entity.Player;

public interface PlayerDao {
	public boolean insertPlayers(Player playerDetails);
}
