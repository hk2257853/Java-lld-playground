package behavioralDesignPattern.statePattern;

public class MedState implements StateIF {

	@Override
	public void turnUp(Fan fan) {
		System.out.println("Fan now in Off state");
		fan.setState(new OffState());
	}

	@Override
	public void turnDown(Fan fan) {
		System.out.println("Fan now in Low state");
		fan.setState(new LowState());
	}

}
