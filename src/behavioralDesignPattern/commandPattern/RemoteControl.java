package behavioralDesignPattern.commandPattern;

import java.util.Stack;

public class RemoteControl {
	private Stack<CommandIF> history = new Stack<>();

	public void press(CommandIF command) {
		command.execute();
		history.add(command);
	}

	public void undo() {
		if (!history.isEmpty()) {
			history.pop().undo();
		} else {
			System.out.println("Nothing to undo");
		}
	}

}
