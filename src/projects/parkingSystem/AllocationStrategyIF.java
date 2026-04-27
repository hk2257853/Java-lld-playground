package projects.parkingSystem;

import java.util.List;

public interface AllocationStrategyIF {
	public Slot allocate(List<Slot> slotList);
}
