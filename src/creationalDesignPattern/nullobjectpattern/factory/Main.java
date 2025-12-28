package creationalDesignPattern.nullobjectpattern.factory;

import creationalDesignPattern.nullobjectpattern.shape.ShapeIF;

public class Main {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		ShapeIF shape = shapeFactory.getShape("ShapeA");
		shape.draw();

		shape = shapeFactory.getShape("ShapeC");
		shape.draw();
	}
}
