package behavioralDesignPattern.interpreterpattern;

public class TerminalExpression implements ExpressionIF {
	String terminal;

	public TerminalExpression(String terminal) {
		this.terminal = terminal;
	}

	@Override
	public int interpret(Context context) {
		return context.getVariableMap().get(terminal);
	}

}
