package behavioralDesignPattern.interpreterpattern;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Context context = new Context();
		Map<String, Integer> variableMap = new HashMap<>();
		variableMap.put("a", 12);
		variableMap.put("b", 5);
		variableMap.put("c", 3);
		variableMap.put("d", 9);
		context.setVariableMap(variableMap);

		ExpressionIF expression1 = new AddExpression(
				new MultiplyExpression(new TerminalExpression("a"), new TerminalExpression("b")),
				new AddExpression(new TerminalExpression("a"), new TerminalExpression("b")));
		System.out.println("Expression: (a*b)+c = " + expression1.interpret(context));
	}
}