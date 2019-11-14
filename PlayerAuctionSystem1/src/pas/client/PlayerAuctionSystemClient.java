package pas.client;

import java.util.List;
import java.util.Scanner;

import pas.dao.PlayerDaoImpl;
import pas.dto.PlayerDto;
import pas.entity.Player;
import pas.entity.Team;
import pas.exceptions.DuplicateEntryException;
import pas.exceptions.InvalidCategoryException;
import pas.exceptions.InvalidTeamNameException;
import pas.exceptions.NotABatsmanException;
import pas.exceptions.NotABowlerException;
import pas.exceptions.ServiceException;
import pas.manager.PlayerManagerImpl;
import pas.manager.TeamManagerImpl;
import pas.manager.TeamMnager;

public class PlayerAuctionSystemClient {

	public static void main(String[] args) {
		Player player = new Player();
		Team team = new Team();
		PlayerManagerImpl playerManager = new PlayerManagerImpl();
		TeamMnager teamManager = new TeamManagerImpl();
		System.out.println("Enter your choice \n1. Add a player\n2. Display player \n3. Exit");
		Scanner scan=new Scanner(System.in);

		int choice = scan.nextInt();
		while (choice != 3) {
			switch (choice) {
			case 1:

				// Take Input
				// Use the input to initialize objects
				// Send
				System.out.println(" Add a player ");
				System.out.print("Enter player name :-");
				String playerName = scan.next();

				player.setPlayerName(playerName.toUpperCase());
				System.out.print("Enter category :-");
				String category = scan.next();

				player.setCategory(category.toUpperCase());
				System.out.print("Enter Highest Score :-");
				int highestScore = scan.nextInt();
				player.setHighestScore(highestScore);
//				if (category.equalsIgnoreCase("Batsman")) {
//
//					player.setHighestScore(highestScore);
//				} else
//					player.setHighestScore(highestScore);

				System.out.print("Enter Best figure :-");
				String bestFigure = scan.next();
				player.setBestFigure(bestFigure);

				System.out.print("Enter Team Name :-");
				String teamName = scan.next();

				team.setTeamName(teamName.toUpperCase());
				player.setTeam(team);
				try {
					playerManager.insertPlayer(player);
				} catch (ServiceException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				System.out.println(" Display players ");
				System.out.println(" Enter team name: ");
				teamName = scan.next();
				List<PlayerDto> players = null;
				try {
					players = teamManager.fetchPlayerByTeam(teamName.toUpperCase());
				} catch (ServiceException e) {
					System.out.println(e.getMessage());
				}
				for (PlayerDto p : players) {
					System.out.println(p.getPlayerName() + " " + p.getCategory());
				}
				break;
			case 3:
				System.out.println("Exit");
				break;
			default:
				System.out.println("you entered a wrong choice");
				break;
			}
			System.out.println("Enter your choice \n1. Add a player\n2. Display player \n3. Exit");
			choice = scan.nextInt();
		}

	}

}
