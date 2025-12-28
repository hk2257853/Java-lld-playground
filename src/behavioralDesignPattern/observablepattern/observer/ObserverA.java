package behavioralDesignPattern.observablepattern.observer;

import behavioralDesignPattern.observablepattern.observable.WeatherObservableIF;

public class ObserverA implements WeatherObserverIF {

	private final WeatherObservableIF weatherStation;

	public ObserverA(WeatherObservableIF weatherStation) {
		this.weatherStation = weatherStation;
		weatherStation.addObserver(this);
	}

	// CurrentConditionsDisplay implements the update method in its own way
	@Override
	public void update() {
		System.out.println("ObserverA: Current Weather Conditions: " + weatherStation.toString());
	}

}
