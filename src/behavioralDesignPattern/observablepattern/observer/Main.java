package behavioralDesignPattern.observablepattern.observer;

import behavioralDesignPattern.observablepattern.observable.WeatherObservableIF;
import behavioralDesignPattern.observablepattern.observable.WeatherStation;

public class Main {
	public static void main(String[] args) {
		System.out.println("###### State Design Pattern ######");
		// Create the weather station (observable/subject)
		WeatherObservableIF weatherStation = new WeatherStation();

		// Create displays (observers)
		ObserverA observerDisplayA = new ObserverA(weatherStation);
		ObserverB observerDisplayB = new ObserverB(weatherStation);

		System.out.println("===>>> Initial Weather Update");
		weatherStation.setWeatherReadings(80, 65, 30.4f);

		System.out.println("===>>> Second Weather Update");
		weatherStation.setWeatherReadings(82, 70, 29.2f);

		// Remove observerDisplayB display
		weatherStation.removeObserver(observerDisplayB);

		System.out.println("===>>> Third Weather Update");
		weatherStation.setWeatherReadings(70, 21, 29.2f);
		// observerDisplayB display will not be notified
	}

}
