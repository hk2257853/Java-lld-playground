package creationalDesignPattern.factorypattern.factory;

import creationalDesignPattern.factorypattern.shape.ShapeA;
import creationalDesignPattern.factorypattern.shape.ShapeB;
import creationalDesignPattern.factorypattern.shape.ShapeIF;

public class ShapeFactory {
	ShapeIF shape;

	ShapeIF getShape(String input) {
		switch (input) {
		case "ShapeA": // NOTE: We must use enums or constant, not hardcode
			return new ShapeA();
		case "ShapeB":
			return new ShapeB();
		default:
			break;
		}
		return null;
	}
}
