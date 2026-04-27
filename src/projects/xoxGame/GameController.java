package projects.xoxGame;

import java.util.ArrayList;
import java.util.List;

public class GameController {
	private List<PlayerIF> playerList = new ArrayList<PlayerIF>();
	private Board board;
	public GameStateStrategyIF gameStateStrategy;
	public GameStateEnum gameState;

	public GameController(Board board, GameStateStrategyIF gameStateStrategy) {
		this.board = board;
		this.gameStateStrategy = gameStateStrategy;
		this.gameState = GameStateEnum.ONGOING;
	}

	public void addPlayer(PlayerIF player) {
		if (playerList.size() < 2)
			playerList.add(player);
	}

	public PlayerIF getCurrentPlayer(int turn) {
		PlayerIF currentPlayer = playerList.get(turn % playerList.size());
		System.out.println("Current Player: " + currentPlayer.getSymbol());
		return currentPlayer;
	}

	public boolean addSymbol(int x, int y, PlayerIF player) {
		if (!board.isSlotValid(x, y))
			return false;

		board.updateBoard(x, y, player.getSymbol());

		this.gameState = gameStateStrategy.checkBoardStatus(board);
		System.out.println("Current Game State is: " + gameState);

		if (this.gameState == GameStateEnum.WIN || this.gameState == GameStateEnum.DRAW) {
			System.out.println("Re-initialising board");
			board.initialiseEmptyBoard();
		}
		this.gameState = GameStateEnum.ONGOING;
		return true;
	}

}
