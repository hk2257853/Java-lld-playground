package projects.parkingSystem;

public class VehicleBasedPricing implements PriceCalculatorIF {
	private int price = 0;
	VehicleType vehicleType;

	public VehicleBasedPricing(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	@Override
	public int calculatePrice() {
		if (vehicleType == VehicleType.BIKE)
			price = 10;
		if (vehicleType == VehicleType.CAR)
			price = 20;
		if (vehicleType == VehicleType.TRUCK)
			price = 30;
		return price;
	}

}
