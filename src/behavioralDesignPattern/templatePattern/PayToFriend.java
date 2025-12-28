package behavioralDesignPattern.templatePattern;

public class PayToFriend extends PaymentFlow {

	@Override
	public void validateRequest() {
		System.out.println("validated request for friend");
	}

	@Override
	public void calculateFees() {
		System.out.println("fees: 2Rs");

	}

	@Override
	public void debit() {
		System.out.println("40rs deducted");

	}

	@Override
	public void credit() {
		System.out.println("40rs credited");
	}
	

}
