package behavioralDesignPattern.commandPattern;

public class LightOffCommand implements CommandIF {
	private RecieverLight light;

	public LightOffCommand(RecieverLight light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}

}
