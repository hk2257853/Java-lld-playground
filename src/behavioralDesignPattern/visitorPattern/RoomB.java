package behavioralDesignPattern.visitorPattern;

public class RoomB implements RoomIF {

	@Override
	public void accept(VisitorIF visitor) {
		visitor.visitB(this); // damn this is next lvl stuff
	}

}
