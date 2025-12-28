package behavioralDesignPattern.mediatorPattern;

public interface BidderIF {
	public void bid(Integer amount);

	public void receiveNotification(String name, Integer message);
	
	String getName();
}
