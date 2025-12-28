package behavioralDesignPattern.templatePattern;

public abstract class PaymentFlow {
	public abstract void validateRequest();

	public abstract void calculateFees();

	public abstract void debit();

	public abstract void credit();

	public final void sendMoney() {
		validateRequest();
		calculateFees();
		debit();
		credit();
	}
}
