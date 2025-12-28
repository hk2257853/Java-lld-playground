package behavioralDesignPattern.mediatorPattern;

public class Main {
	public static void main(String[] args) {

		MediatorIF mediator = new Mediator();

		BidderIF bidder1 = new Bidder(mediator, "bidder1");
		BidderIF bidder2 = new Bidder(mediator, "bidder2");
		BidderIF bidder3 = new Bidder(mediator, "bidder3");

		mediator.addBidder(bidder1);
		mediator.addBidder(bidder2);
		mediator.addBidder(bidder3);

		bidder1.bid(10);
		bidder2.bid(15);
		bidder3.bid(20);
		bidder1.bid(10);
		bidder2.bid(35);
	}
}