package playerAuctionSystem.manager;

import com.mindtree.exceptions.DuplicateEntryException;
import com.mindtree.exceptions.InvalidBestFigureException;
import com.mindtree.exceptions.InvalidCategoryException;
import com.mindtree.exceptions.InvalidTeamNameException;
import com.mindtree.exceptions.NotABatsmanException;
import com.mindtree.exceptions.NotABowlerException;

import playerAuctionSystem.dao.PlayerDao;
import playerAuctionSystem.dao.PlayerDaoImpl;

public class PlayerManagerImpl implements PlayerManager {
	@Override
	public boolean validateCategory(String category) {
		if (category.equalsIgnoreCase("Batsman") == true || category.equalsIgnoreCase("Bowler") == true || category.equalsIgnoreCase("Allrounder") == true)
		return true;
		else
			return false;
	}
	@Override
	public boolean validateHighestScore(int score) {
		if(score >= 50 && score <= 200)
		return true;
		else
			return false;
		
	}
	@Override
	public boolean validateBestFigure(int score, String bestfigure) {
		if(score>0 && bestfigure != null )
		return true;
		else
			return false;
	}
	@Override
	public boolean isPlayerNameValid(String name) {
		PlayerDaoImpl playerDaoObj=new PlayerDaoImpl();
		if(playerDaoObj.retrievePlayers().contains(name) == true)
		return false;
		else
			return true;
	}

}
