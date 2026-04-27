package projects.parkingSystem;

import java.time.LocalTime;
import java.util.List;

// main mistake was having slot here and a slot in allocation random slot (ars)
// that lead to a block. ars had a different instance/version while here i had a 
// different version

public class ParkingManager {
	public static int ticketId = 0;
	private List<Slot> slotList;
	private AllocationStrategyIF allocationStrategy; // this is how it should be
	// creating a new strategy object here it self is bad, I am fixing PM to use a particular
	// strategy only

	public ParkingManager(List<Slot> slotList, AllocationStrategyIF allocationStrategy) {
		this.slotList = slotList;
		this.allocationStrategy = allocationStrategy;

	}

	public Ticket assingTicket(Vehicle vehicle) {
		Slot mySlot = allocationStrategy.allocate(slotList);
		if (mySlot == null) {
			System.out.println("No slots available");
			return null;
		}
		mySlot.setIsoccupied(true);
		mySlot.setVehicle(vehicle);

		Ticket tick = new Ticket(++ticketId, mySlot, LocalTime.now());

		return tick;
	}

	public void releasingTicket(Ticket ticket) {
		// free the slot, give the price,
		PriceCalculatorIF priceCal = new FlatPricing(LocalTime.now());
		Slot mySlot = ticket.getSlot();
		mySlot.setIsoccupied(false);
		System.out.println("Freed Vehicle: " + mySlot.getVehicle().getVehicleNumber() + " Price is: " + priceCal.calculatePrice());
		mySlot.setVehicle(null);

	}
}
