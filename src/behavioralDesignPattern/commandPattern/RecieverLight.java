package behavioralDesignPattern.commandPattern;

public class RecieverLight {
	Boolean State;

	public void on() {
		State = true;
		System.out.println("Lights On");
	}

	public void off() {
		State = false;
		System.out.println("Lights Off");
	}
}
