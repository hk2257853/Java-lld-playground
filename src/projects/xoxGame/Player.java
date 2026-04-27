	package projects.xoxGame;

public class Player implements PlayerIF {
	String name;
	SymbolEnum symbol;

	public Player(String name, SymbolEnum symbol) {
		this.name = name;
		this.symbol = symbol;
	}

	@Override
	public SymbolEnum getSymbol() {
		return this.symbol;
	}
}
