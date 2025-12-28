package behavioralDesignPattern.mediatorPattern;

public interface MediatorIF {
	public void sendNotification(String name);

	public void placeBid(Integer amount, String name);
	
	public void addBidder(BidderIF bidder);
}
