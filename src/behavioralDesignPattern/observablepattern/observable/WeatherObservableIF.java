package behavioralDesignPattern.observablepattern.observable;

import behavioralDesignPattern.observablepattern.observer.WeatherObserverIF;

//Observable(Subject) interface
//Defines methods for managing observers and notifying them of changes
public interface WeatherObservableIF {

	void addObserver(WeatherObserverIF observer);

	void removeObserver(WeatherObserverIF observer);

	void notifyObservers();

	void setWeatherReadings(float temperature, float humidity, float pressure);
}
