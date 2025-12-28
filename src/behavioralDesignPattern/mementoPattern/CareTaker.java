package behavioralDesignPattern.mementoPattern;

import java.util.Stack;

public class CareTaker {
	private Stack<MementoIF> history = new Stack<>();

	public void add(MementoIF memento) {
		history.push(memento);
	}

	public MementoIF getLastMemento() { // should not access/ print anything. just for managing history that's it.
		if (!history.isEmpty()) {
			return history.pop();
		}
		System.out.println("No previous state found");
		return null;
	}
}
