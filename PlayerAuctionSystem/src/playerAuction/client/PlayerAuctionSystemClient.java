package playerAuction.client;

import java.util.Scanner;

import com.mindtree.exceptions.DuplicateEntryException;
import com.mindtree.exceptions.InvalidBestFigureException;
import com.mindtree.exceptions.InvalidCategoryException;
import com.mindtree.exceptions.InvalidTeamNameException;
import com.mindtree.exceptions.NotABatsmanException;
import com.mindtree.exceptions.NotABowlerException;

import playerAuctionSystem.dao.PlayerDaoImpl;
import playerAuctionSystem.entity.Player;
import playerAuctionSystem.entity.Team;
import playerAuctionSystem.entity.TeamPlayer;
import playerAuctionSystem.manager.PlayerManagerImpl;
import playerAuctionSystem.manager.TeamManagerImpl;

public class PlayerAuctionSystemClient {

	public static void main(String[] args) throws InvalidCategoryException, InvalidTeamNameException,
			NotABatsmanException, NotABowlerException, DuplicateEntryException, InvalidBestFigureException {
		PlayerManagerImpl validationPlayer = new PlayerManagerImpl();
		TeamManagerImpl validationTeam = new TeamManagerImpl();
		Player playerDetails1 = new Player();
		Team team1 = new Team();
		TeamPlayer teamPlayer = new TeamPlayer();
		PlayerDaoImpl playerDetails = new PlayerDaoImpl();
		System.out.println("Enter your choice \n1. Add a player\n2. Display player \n3. Exit");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		while (choice != 3) {
			switch (choice) {
			case 1:
				System.out.println(" Add a player ");
				System.out.print("Enter player name :-");
				String playerName = scan.next();
				if (!validationPlayer.isPlayerNameValid(playerName))
					throw new DuplicateEntryException("Player details already exist in the database");
				else
					playerDetails1.setPlayerName(playerName);
				System.out.print("Enter category :-");
				String category = scan.next();
				if (validationPlayer.validateCategory(category) == false) {
					throw new InvalidCategoryException("Invalid category name please check your input");
				} else
					playerDetails1.setCategory(category);
				System.out.print("Enter Highest Score :-");
				int highestScore = scan.nextInt();
				if (category.equalsIgnoreCase("Batsman")) {
					if (validationPlayer.validateHighestScore(highestScore) == false)
						throw new NotABatsmanException("Invalid Batsman, please check your input");
					else
						playerDetails1.setHighestScore(highestScore);
				} else
					playerDetails1.setHighestScore(highestScore);
				System.out.print("Enter Best figure :-");
				String bestFigure = scan.next();
				if (bestFigure.matches("[\\d]+[/][\\d]+"))
					if (category.equalsIgnoreCase("Bowler")) {
						if (validationPlayer.validateBestFigure(highestScore, bestFigure) == false)
							throw new NotABowlerException("Invalid Batsman, please check your input");
						else
							playerDetails1.setBestFigure(bestFigure);
					} else
						playerDetails1.setBestFigure(bestFigure);
				else
					throw new InvalidBestFigureException("Inavalid bestfigure, please check your input");
				System.out.print("Enter Team Name :-");
				String teamName = scan.next();
				if (validationTeam.validateTeamName(teamName) == false) {
					throw new InvalidTeamNameException("Invalid team name, please check your input");
				} else
					team1.setTeamName(teamName.toUpperCase());
				playerDetails.insertPlayers(playerDetails1);
				break;
			case 2:
				System.out.println(" Display players ");
				System.out.println(" Enter team name: ");
				String teamNameInput = scan.next();
				if (validationTeam.validateTeamName(teamNameInput) == false) {
					throw new InvalidTeamNameException("Invalid team name, please check your input");
				} else
					team1.setTeamName(teamNameInput.toUpperCase());

				break;
			case 3:
				System.out.println("Exit");
				break;
			default:
				System.out.println("you entered a wrong choice");
			}
			System.out.println("Enter your choice \n1. Add a player\n2. Display player \n3. Exit");
			choice = scan.nextInt();
		}

	}

}
