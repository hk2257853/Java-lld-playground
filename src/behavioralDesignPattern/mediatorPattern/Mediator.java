package behavioralDesignPattern.mediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class Mediator implements MediatorIF {
	private List<BidderIF> bidderList = new ArrayList<BidderIF>();
	private Integer currentBidAmount = 0;

	@Override
	public void placeBid(Integer amount, String name) {
		if (amount > this.currentBidAmount) {
			this.currentBidAmount = amount;
			this.sendNotification(name);
		} else
			System.out.println("Please enter amount more than: " + this.currentBidAmount);
	}

	@Override
	public void sendNotification(String name) {
		System.out.println("Bid updated");
		for (BidderIF bidderIF : bidderList) {
			if (!bidderIF.getName().equals(name))
				bidderIF.receiveNotification(name, currentBidAmount);
		}
	}

	@Override
	public void addBidder(BidderIF bidder) {
		bidderList.add(bidder);
	}

}
