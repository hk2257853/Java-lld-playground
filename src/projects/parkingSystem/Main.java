package projects.parkingSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// 1 good thing is creating ParkingManager guided me on what other things we need
		// in main
		
		List<Slot> slots = new ArrayList<>();
        slots.add(new Slot(1, false, null));
        slots.add(new Slot(2, false, null));
        slots.add(new Slot(3, false, null));
        
        AllocationStrategyIF allocationWorker = new AllocateRandomSlot();
		
		ParkingManager parkingManager = new ParkingManager(slots, allocationWorker);
		Vehicle vehicle = new Vehicle("12", VehicleType.CAR);
		Ticket ticket = parkingManager.assingTicket(vehicle);
		parkingManager.releasingTicket(ticket);
		
		// that was fun
	}
}
