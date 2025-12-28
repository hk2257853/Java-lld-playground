package behavioralDesignPattern.mediatorPattern;

public class Bidder implements BidderIF {
	private String name;
	private MediatorIF mediator;

	Bidder(MediatorIF mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}

	@Override
	public void bid(Integer amount) {
		mediator.placeBid(amount, this.name);
	}

	@Override
	public void receiveNotification(String name, Integer message) {
		System.out.println(this.name + ": " + name + " has bid: " + message);
	}

	@Override
	public String getName() {
		return this.name;
	}

}
