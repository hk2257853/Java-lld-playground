package behavioralDesignPattern.commandPattern;

public class LightOnCommand implements CommandIF {
	private RecieverLight light;

	public LightOnCommand(RecieverLight light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();

	}

}
