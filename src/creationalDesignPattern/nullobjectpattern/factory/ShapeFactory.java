package creationalDesignPattern.nullobjectpattern.factory;

import creationalDesignPattern.nullobjectpattern.shape.NullShape;
import creationalDesignPattern.nullobjectpattern.shape.ShapeA;
import creationalDesignPattern.nullobjectpattern.shape.ShapeB;
import creationalDesignPattern.nullobjectpattern.shape.ShapeIF;

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
		return new NullShape();
	}
}
