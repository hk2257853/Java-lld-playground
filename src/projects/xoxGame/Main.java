package projects.xoxGame;

import java.util.Scanner;

// Damn the basic version is working. 
// now there r various enhancements i can do (like 3 is the hardcoded size right now, could have gone with nxn).
public class Main {
	public static void main(String[] args) {
		Board gameBoard = new Board();
		GameStateStrategyIF gameStateStrategyIF = new StandardGameStrategy();
		GameController gameController = new GameController(gameBoard, gameStateStrategyIF);

		gameBoard.printBoard();

		gameController.addPlayer(new Player("XBoi", SymbolEnum.X));
		gameController.addPlayer(new Player("YBoi", SymbolEnum.O));

		try (Scanner sc = new Scanner(System.in)) {
			int count = 0;
			while (true) {
				boolean moveSuccess = false;

				PlayerIF player = gameController.getCurrentPlayer(count);
				int x = sc.nextInt();
				int y = sc.nextInt();
				moveSuccess = gameController.addSymbol(x, y, player);

				if (moveSuccess)
					count++;
				else
					System.out.println("please enter valid input");

				gameBoard.printBoard();
			}
			// lol that's actually fun to play
		}

	}
}
