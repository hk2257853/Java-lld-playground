package behavioralDesignPattern.interpreterpattern;

public class MultiplyExpression implements ExpressionIF {
	ExpressionIF leftExpression;
	ExpressionIF rightExpression;

	public MultiplyExpression(ExpressionIF leftExpression, ExpressionIF rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}

	@Override
	public int interpret(Context context) {
		return leftExpression.interpret(context) * rightExpression.interpret(context);
	}

}
