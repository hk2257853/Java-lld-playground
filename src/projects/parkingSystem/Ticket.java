package projects.parkingSystem;

import java.time.LocalTime;

public class Ticket {
	private int ticketId;
	private Slot slot;
	private LocalTime inTime;
	private int outTime;
	
	

	public Ticket(int ticketId, Slot slot, LocalTime inTime) {
		this.ticketId = ticketId;
		this.slot = slot;
		this.inTime = inTime;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public Slot getSlot() {
		return slot;
	}

	public void setSlot(Slot slot) {
		this.slot = slot;
	}

	public LocalTime getInTime() {
		return inTime;
	}

	public void setInTime(LocalTime inTime) {
		this.inTime = inTime;
	}

	public int getOutTime() {
		return outTime;
	}

	public void setOutTime(int outTime) {
		this.outTime = outTime;
	}

}
