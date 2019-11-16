
/**
 * 
 */
package pas.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import pas.dao.TeamDao;
import pas.dao.TeamDaoImpl;
import pas.dto.CategoryDto;
import pas.dto.PlayerDto;
import pas.dto.ResponseDto;
import pas.dto.TeamNameDto;
import pas.entity.Player;
import pas.entity.Team;
import pas.exceptions.DaoException;
import pas.exceptions.ServiceException;
import pas.manager.PlayerManager;
import pas.manager.PlayerManagerImpl;
import pas.manager.TeamManagerImpl;
import pas.manager.TeamMnager;

/**
 * @author Sudhanshu
 *
 */
public class PlayerController extends HttpServlet {

	PlayerManager playerManager;
	TeamMnager teamManager;
	TeamDao teamDao;

	public PlayerController() {
		System.out.println("MyController constructor");
		playerManager = new PlayerManagerImpl();
		teamManager = new TeamManagerImpl();
		teamDao = new TeamDaoImpl();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println(request.getRequestURI());

		System.out.println("Currently in service method in PlayerController");
		if (request.getRequestURI().contains("addPlayer")) {
			addPlayer(request, response);
		} else if (request.getRequestURI().contains("/displayPlayers")) {
			System.out.println("hello");
			displayPlayers(request, response);
		} else if (request.getRequestURI().contains("getCategories")) {
			getCategories(request, response);
		} else if (request.getRequestURI().contains("getTeamName")) {
			getTeamName(request, response);
		} else if (request.getRequestURI().contains("setPlayerDetails")) {
			setPlayerDetails(request, response);
		} else if (request.getRequestURI().contains("displayPlayerDetails")) {
			System.out.println("got ajax request data");
			displayPlayerDetails(request, response);
		}
	}

	private void displayPlayerDetails(HttpServletRequest request, HttpServletResponse response) {

		Gson gson = new Gson();
		String teamName = request.getParameter("teamName");
		ResponseDto responseDto = new ResponseDto();
		responseDto.setId("pas.displayPlayerDetails");
		List<String> errors = new ArrayList<>();
		List<PlayerDto> list = new ArrayList<PlayerDto>();

		try {
			list = teamManager.fetchPlayerByTeam(teamName);

		} catch (ServiceException e) {
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			errors.add(e.getMessage());
		}
		responseDto.setData(list);
		responseDto.setError(errors);
		String playerDetailsJson = gson.toJson(responseDto);
		System.out.println("Response is " + playerDetailsJson);
		try {
			response.setContentType("application/json");
			PrintWriter writer = response.getWriter();
			writer.append(playerDetailsJson);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void setPlayerDetails(HttpServletRequest request, HttpServletResponse response) {
		Gson gson = new Gson();
		ResponseDto responseDto = new ResponseDto();
		List<String> errors = new ArrayList<>();
		responseDto.setId("pas.setPlayerDetails");
		String result = "";
		String playerName = request.getParameter("playerName");
		String category = request.getParameter("category");
		Integer highestScore = Integer.parseInt(request.getParameter("highestScore"));
		String bestFigure = request.getParameter("bestFigure");
		String teamName = request.getParameter("teamName");
		Team team = new Team();
		team.setTeamName(teamName);
		Player player = new Player(0, playerName, category, highestScore, bestFigure, team);

		try {
			result = playerManager.insertPlayer(player);

		} catch (ServiceException e) {
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			errors.add(e.getMessage());
		}
		responseDto.setData(result);
		responseDto.setError(errors);

		String responseJson = gson.toJson(responseDto);

		response.setContentType("application/json");
		PrintWriter writer = null;
		try {
			writer = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		writer.append(responseJson);

	}

	private void getTeamName(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Gson gson = new Gson(); // Gson object is used to convert JSON to object and vice versa
		String[] teamNames = null;

		ResponseDto responseDto = new ResponseDto();

		responseDto.setId("pas.getTeamName");

		int j = 0;
		List<String> errors = new ArrayList<>();
		List<TeamNameDto> teamNameList = new ArrayList<>();
		try {
			Set<String> teamNamesSet = teamManager.listTeamNames();
			teamNames = new String[teamNamesSet.size()];
			System.out.println(teamNames.length);
			for (String teamName : teamNamesSet) {
				teamNames[j] = teamName;
				j++;
			}
			String[] teamNamesArray = teamNames;
			String[] teamNamesVisibleArray = teamNames;
			// List<String> categories = Arrays.asList(categoryArray);

			for (int i = 0; i < teamNamesArray.length; i++) {
				TeamNameDto teamNameDto = new TeamNameDto(teamNamesArray[i], teamNamesVisibleArray[i]);
				teamNameList.add(teamNameDto);
			}
		} catch (ServiceException e) {
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			errors.add(e.getMessage());
		}
		responseDto.setError(errors);

		responseDto.setData(teamNameList);

		String teamNamesJson = gson.toJson(responseDto);

		response.setContentType("application/json");
		PrintWriter writer = response.getWriter();
		writer.append(teamNamesJson);

	}

	private void getCategories(HttpServletRequest request, HttpServletResponse response) throws IOException {

		Gson gson = new Gson(); // Gson object is used to convert JSON to object and vice versa
		String[] categoryArray = { "batsman", "bowler", "allrounder" };
		String[] categoriesVisibleArr = { "Batsman", "Bowler", "Allrounder" };
		// List<String> categories = Arrays.asList(categoryArray);
		List<CategoryDto> categories = new ArrayList<>();

		for (int i = 0; i < categoryArray.length; i++) {
			CategoryDto categoryDto = new CategoryDto(categoryArray[i], categoriesVisibleArr[i]);
			categories.add(categoryDto);
		}

		String categoriesJson = gson.toJson(categories);

		response.setContentType("application/json");
		PrintWriter writer = response.getWriter();
		writer.append(categoriesJson);
	}

	private void displayPlayers(HttpServletRequest request, HttpServletResponse response) {
		String teamName = request.getParameter("teamName");
		String result = "";
		List<PlayerDto> list = new ArrayList<PlayerDto>();
		try {
			list = teamManager.fetchPlayerByTeam(teamName);
			result = formatListToString(list);
		} catch (ServiceException e) {
			result = e.getMessage();
		}

		try {
			response.setContentType("text/html");
			PrintWriter writer = response.getWriter();
			writer.append(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private String formatListToString(List<PlayerDto> list) {
		String result = "<table>" + "<tr><th width=10>Player Name</th><th>:</th><th width=10>Category</th></tr>";
		for (PlayerDto dto : list) {

			result += "<tr><td width=10>" + dto.getPlayerName() + "</td><td>:</td><td width=10>" + dto.getCategory()
					+ "</td></tr>";

		}
		result += "</table>";
		return result;
	}

	private void addPlayer(HttpServletRequest request, HttpServletResponse response) {
		String result = "";
		System.out.println("Inside addPlayer method ");
		String playerName = request.getParameter("name");
		String category = request.getParameter("category");
		Integer highestScore = Integer.parseInt(request.getParameter("highestScore"));
		String bestFigure = request.getParameter("bestFigure");
		String teamName = request.getParameter("teamName");
		Team team = new Team();
		team.setTeamName(teamName);
		Player player = new Player(0, playerName, category, highestScore, bestFigure, team);

		try {
			result = playerManager.insertPlayer(player);
		} catch (ServiceException e) {
			result = e.getMessage();
		}

		try {
			response.setContentType("text/html");
			PrintWriter writer = response.getWriter();
			writer.append(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) {

		System.out.println("Inside doPost");
	}

}
