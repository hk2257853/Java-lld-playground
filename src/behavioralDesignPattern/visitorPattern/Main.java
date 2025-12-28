package behavioralDesignPattern.visitorPattern;

public class Main {
	public static void main(String[] args) {
		RoomIF rA1 = new RoomA();
		VisitorIF vA1 = new Pricing();			
		rA1.accept(vA1); // dispatch 1
	}
}
