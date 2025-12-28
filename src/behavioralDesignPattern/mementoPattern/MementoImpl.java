package behavioralDesignPattern.mementoPattern;

public class MementoImpl implements MementoIF {
	private final State state;

	public MementoImpl(State state) {
		this.state = state;
	}

	@Override
	public State getState() {
		return this.state;
	}

}
