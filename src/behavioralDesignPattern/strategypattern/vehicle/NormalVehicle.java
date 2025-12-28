package behavioralDesignPattern.strategypattern.vehicle;

import behavioralDesignPattern.strategypattern.strategy.NormalDrive;

public class NormalVehicle extends Vehicle {

	public NormalVehicle() {
		super(new NormalDrive());
	}
}
