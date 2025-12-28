package behavioralDesignPattern.commandPattern;

public class Main {
	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl(); // I have a remote control
		RecieverLight light = new RecieverLight(); // I will control a light
		CommandIF cmdOn = new LightOnCommand(light); // Remote will give command to a light
		CommandIF cmdOff = new LightOffCommand(light);

		remote.press(cmdOn);
		remote.press(cmdOff);
		remote.undo();
		remote.undo();
		remote.undo();
	}
}
