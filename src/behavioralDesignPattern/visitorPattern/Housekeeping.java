package behavioralDesignPattern.visitorPattern;

public class Housekeeping implements VisitorIF {

	@Override
	public void visitA(RoomA roomA) {
		System.out.println("Housekeeping on RoomA");
	}

	@Override
	public void visitB(RoomB roomB) {
		System.out.println("Housekeeping on RoomB");
	}

}
