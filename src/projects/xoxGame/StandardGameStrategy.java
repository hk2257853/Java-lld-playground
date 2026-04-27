package projects.xoxGame;

public class StandardGameStrategy implements GameStateStrategyIF {

	// This can be refactored (put horizontal in 1 function, vertical in another etc)
	@Override
	public GameStateEnum checkBoardStatus(Board board) {
		SymbolEnum[][] myBoard = board.getBoard();
		SymbolEnum winner = null;

		// horizontal
		for (int i = 0; i < board.getSize(); i++) {
			int count = 0;
			for (int j = 0; j < myBoard[0].length - 1; j++) {// just trying .length
				if (myBoard[i][j] != SymbolEnum.EMPTY && myBoard[i][j] == myBoard[i][j + 1]) {
					count++;
				}
				if (count == 2)
					winner = myBoard[i][j];
			}
		}

		// vertical
		if (winner == null)
			for (int i = 0; i < board.getSize(); i++) {
				int count = 0;
				for (int j = 0; j < board.getSize() - 1; j++) {
					if (myBoard[j][i] != SymbolEnum.EMPTY && myBoard[j][i] == myBoard[j + 1][i]) {
						count++;
					}
					if (count == 2)
						winner = myBoard[j][i];
				}
			}

		// diagonal
		if (winner == null) {
			int count = 0;
			for (int i = 0; i < board.getSize() - 1; i++) {
				if (myBoard[i][i] != SymbolEnum.EMPTY && myBoard[i][i] == myBoard[i + 1][i + 1]) {
					count++;
				}
				if (count == 2)
					winner = myBoard[i][i];
			}
		}

		// anti diagonal
		if (winner == null) {
			int count = 0;
			int size = myBoard.length - 1;
			for (int i = 0; i < size; i++) {
				if (myBoard[i][size - i] != SymbolEnum.EMPTY && myBoard[i][size - i] == myBoard[i + 1][size - i - 1])
					count++;
				if (count == 2)
					winner = myBoard[i][size - i];
			}
		}

		if (winner != null) {
			System.out.println("And the winner is " + winner);
			return GameStateEnum.WIN;
		}

		Boolean isBoardFull = true;
		for (int i = 0; i < board.getSize(); i++) {
			for (int j = 0; j < board.getSize(); j++) {
				if (myBoard[i][j] == SymbolEnum.EMPTY) {
					isBoardFull = false;
				}
			}
		}

		if (isBoardFull) {
			System.out.println("Board is full");
			return GameStateEnum.DRAW;
		}

		return GameStateEnum.ONGOING;
	}

}
