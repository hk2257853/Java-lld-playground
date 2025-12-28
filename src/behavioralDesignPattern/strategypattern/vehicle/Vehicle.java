package behavioralDesignPattern.strategypattern.vehicle;

import behavioralDesignPattern.strategypattern.strategy.DriveStrategyIF;

public class Vehicle {
	DriveStrategyIF driveStrategyObject;

	// This is called constructor injection - The Vehicle doesn’t create a drive
	// strategy by itself. It accepts one as a parameter
	Vehicle(DriveStrategyIF driveStrategyObject) {
		this.driveStrategyObject = driveStrategyObject;
	}

	public void drive() {
		driveStrategyObject.drive();
	}

}
