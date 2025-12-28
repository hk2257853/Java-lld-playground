package behavioralDesignPattern.templatePattern;

public class Main {
	public static void main(String[] args) {
		PaymentFlow payToFriend = new PayToFriend();
		payToFriend.sendMoney();

		PaymentFlow payToMerchant = new PayToMerchant();
		payToMerchant.sendMoney();
	}
}
