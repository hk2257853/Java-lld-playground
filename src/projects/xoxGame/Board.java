package projects.xoxGame;

public class Board {
	SymbolEnum board[][];
	int size;

	public Board() {
		this.size = XOXConstants.nxnBoardSize;
		this.board = new SymbolEnum[size][size];
		initialiseEmptyBoard();
		System.out.println("3x3 board created");
	}

	public void initialiseEmptyBoard() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				board[i][j] = SymbolEnum.EMPTY;
			}
		}
	}

	public SymbolEnum[][] getBoard() {
		return board;
	}

	public boolean isSlotValid(int x, int y) {
		if (x >= XOXConstants.nxnBoardSize || y >= XOXConstants.nxnBoardSize || x < 0 || y < 0)
			return false;
		if (board[x][y] == SymbolEnum.EMPTY)
			return true;
		return false;
	}

	public void updateBoard(int x, int y, SymbolEnum symbol) {
		board[x][y] = symbol;
	}

	public void printBoard() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(board[i][j] + "	");
			}
			System.out.println("");
		}
	}

	public int getSize() {
		return size;
	}

}
