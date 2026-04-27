package projects.parkingSystem;

// i'll need a list of slot somewhere
public class Slot {
	private int slotId;
	private Boolean isoccupied;
	private Vehicle vehicle;

	public Slot(int slotId, Boolean isoccupied, Vehicle vehicle) {
		this.slotId = slotId;
		this.isoccupied = isoccupied;
		this.vehicle = vehicle;
	}

	public int getSlotId() {
		return slotId;
	}

	public void setSlotId(int slotId) {
		this.slotId = slotId;
	}

	public Boolean getIsoccupied() {
		return isoccupied;
	}

	public void setIsoccupied(Boolean isoccupied) {
		this.isoccupied = isoccupied;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
}
