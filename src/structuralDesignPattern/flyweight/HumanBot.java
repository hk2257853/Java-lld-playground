package structuralDesignPattern.flyweight;

public class HumanBot implements RobotIF {
	private String type;
	private Sprite body;

	public HumanBot(String type, Sprite body) {
		this.type = type;
		this.body = body;
	}

	public String getType() {
		return type;
	}

	public Sprite getBody() {
		return body;
	}

	@Override
	public void display(int x, int y) {
		System.out.println(type + " is at X: " + x + "Y: " + y);
	}

}
