package behavioralDesignPattern.templatePattern;

public class PayToMerchant extends PaymentFlow {

	@Override
	public void validateRequest() {
		System.out.println("validated request for merchant");
	}

	@Override
	public void calculateFees() {
		System.out.println("fees: 4Rs");

	}

	@Override
	public void debit() {
		System.out.println("50rs deducted");

	}

	@Override
	public void credit() {
		System.out.println("50rs credited");
	}
	

}
