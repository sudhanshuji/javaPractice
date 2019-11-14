package pas.manager;

import pas.entity.Player;
import pas.exceptions.DuplicateEntryException;
import pas.exceptions.InvalidCategoryException;
import pas.exceptions.InvalidTeamNameException;
import pas.exceptions.NotABatsmanException;
import pas.exceptions.NotABowlerException;
import pas.exceptions.ServiceException;

public interface PlayerManager {
//	public boolean checkPlayerName(String playerName) throws DuplicateEntryException;
//
//	public boolean checkTeamName(String teamName) throws InvalidTeamNameException;
//
//	public boolean checkHighestScore(int highestScore) throws NotABatsmanException;
//
//	public boolean checkCategory(String category) throws InvalidCategoryException;
//
//	boolean checkBestFigure(int score, String bestFigure) throws NotABowlerException;
	
	void insertPlayer(Player player) throws ServiceException;
}
