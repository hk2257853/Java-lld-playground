package behavioralDesignPattern.mementoPattern;

public class Originator {
	State state;

	public Originator(State state) {
		this.state = state;
	}


	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	// TODO: understand the purpose of foll properly
	public MementoIF saveStateToMemento() {
		return new MementoImpl(this.state);
	}

	public void restoreStateFromMemento(MementoIF memento) {
		this.state = memento.getState();
	};

}
