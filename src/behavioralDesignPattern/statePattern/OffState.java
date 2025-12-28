package behavioralDesignPattern.statePattern;

public class OffState implements StateIF {

	@Override
	public void turnUp(Fan fan) {
		System.out.println("Fan now in Low state");
		fan.setState(new LowState()); // I kinda figured out i'll need to crate an object of next state.
	}

	@Override
	public void turnDown(Fan fan) {
		System.out.println("Fan already off");
	}

}
