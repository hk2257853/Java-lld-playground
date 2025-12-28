package structuralDesignPattern.flyweight;

public class DoggeshR implements RobotIF {
	String type;
	Sprite body;
	
	public DoggeshR(String type, Sprite body) {
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
