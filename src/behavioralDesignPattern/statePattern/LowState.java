package behavioralDesignPattern.statePattern;

public class LowState implements StateIF {

	@Override
	public void turnUp(Fan fan) {
		System.out.println("Fan now in Med state");
		fan.setState(new MedState());
	}

	@Override
	public void turnDown(Fan fan) {
		System.out.println("Fan now in Off state");
		fan.setState(new OffState());
	}

}
