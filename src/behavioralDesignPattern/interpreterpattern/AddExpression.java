package behavioralDesignPattern.interpreterpattern;

public class AddExpression implements ExpressionIF {
	ExpressionIF leftExpression;
	ExpressionIF rightExpression;

	public AddExpression(ExpressionIF leftExpression, ExpressionIF rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}

	@Override
	public int interpret(Context context) {
		return leftExpression.interpret(context) + rightExpression.interpret(context);
	}

}
