package behavioralDesignPattern.observablepattern.observer;

import behavioralDesignPattern.observablepattern.observable.WeatherObservableIF;

public class ObserverB implements WeatherObserverIF {

	private final WeatherObservableIF weatherStation;

	public ObserverB(WeatherObservableIF weatherStation) {
		this.weatherStation = weatherStation;
		weatherStation.addObserver(this);
	}

	// CurrentConditionsDisplay implements the update method in its own way
	@Override
	public void update() {
		System.out.println("ObserverB: Current Weather Conditions: " + weatherStation.toString());
	}

}
