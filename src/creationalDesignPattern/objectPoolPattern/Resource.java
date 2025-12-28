package creationalDesignPattern.objectPoolPattern;

public class Resource {
	private int id;
	private String something;

	public Resource(int id, String something) {
		this.id = id;
		this.something = something;
		System.out.println("Current resource: " + id);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSomething() {
		return something;
	}

	public void setSomething(String something) {
		this.something = something;
	}

}
