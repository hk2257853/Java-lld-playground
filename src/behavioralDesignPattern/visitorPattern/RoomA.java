package behavioralDesignPattern.visitorPattern;

public class RoomA implements RoomIF {

	@Override
	public void accept(VisitorIF visitor) {
		visitor.visitA(this); // dispatch 2
	}
}
