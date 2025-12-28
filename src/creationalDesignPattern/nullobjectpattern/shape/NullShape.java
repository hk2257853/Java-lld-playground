package creationalDesignPattern.nullobjectpattern.shape;

public class NullShape implements ShapeIF {
	@Override
	public void draw() {
		System.out.println("Default Drawing - NullShape");
	}
}
