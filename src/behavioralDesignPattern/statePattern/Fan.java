package behavioralDesignPattern.statePattern;

public class Fan {
	private StateIF state;

	public Fan() {
		this.state = new OffState(); // assuming a new fan will always start in off state
	}

	public void setState(StateIF state) {
		this.state = state;
	}

	public void turnUp() {
		state.turnUp(this); // this - the current instance of fan
	}

	public void turnDown() {
		state.turnDown(this);
	}
}
