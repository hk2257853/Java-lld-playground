package projects.parkingSystem;

import java.time.Duration;
import java.time.LocalTime;

public class FlatPricing implements PriceCalculatorIF {
	LocalTime time;

	public FlatPricing(LocalTime time) {
		this.time = time;
	}

	@Override
	public int calculatePrice() {
		Duration diff = Duration.between(time, LocalTime.now());
		long minutes = diff.toMinutes() + 5; // NOTE: just temp for simulating
		return (int) (minutes * 24L);
	}

}
