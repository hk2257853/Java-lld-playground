package behavioralDesignPattern.visitorPattern;

public class Pricing implements VisitorIF {

	@Override
	public void visitA(RoomA roomA) {
		System.out.println("Pricing for RoomA");
	}

	@Override
	public void visitB(RoomB roomB) {
		System.out.println("Pricing for RoomB");
	}

}
