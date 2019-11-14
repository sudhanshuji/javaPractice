package playerAuctionSystem.manager;

public interface PlayerManager {
	public boolean validateCategory(String Category);
	public boolean validateHighestScore(int score);
	public boolean validateBestFigure(int score,String bestfigure);
	public boolean isPlayerNameValid(String name);
}
