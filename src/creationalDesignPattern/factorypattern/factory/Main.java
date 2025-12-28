package creationalDesignPattern.factorypattern.factory;

import creationalDesignPattern.factorypattern.shape.ShapeIF;

public class Main {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		ShapeIF shape = shapeFactory.getShape("ShapeA");
		shape.draw();

		shape = shapeFactory.getShape("ShapeB");
		shape.draw();
	}
}
