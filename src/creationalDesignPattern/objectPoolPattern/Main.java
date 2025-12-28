package creationalDesignPattern.objectPoolPattern;

public class Main {
	public static void main(String[] args) {
		ResourceManager resource = ResourceManager.getInstance();
		resource.getResource();
		resource.getResource();
		resource.getResource();
		Resource rx = resource.getResource();
		resource.getResource(); // null

		resource.releaseResource(rx);
		resource.getResource();
		resource.getResource();
		;
	}
}
