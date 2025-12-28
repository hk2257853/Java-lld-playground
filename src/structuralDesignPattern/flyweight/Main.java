package structuralDesignPattern.flyweight;

public class Main {
	public static void main(String[] args) {

		RobotIF h1 = RobotFactory.getRobot("HumanBot");
		h1.display(1, 2);

		RobotIF h2 = RobotFactory.getRobot("HumanBot");
		h2.display(1, 2);

		RobotIF d1 = RobotFactory.getRobot("DoggeshR");
		d1.display(4, 2);

		RobotIF d2 = RobotFactory.getRobot("DoggeshR");
		d2.display(7, 2);

	}
}
