package projects.parkingSystem;

import java.util.List;
import java.util.Random;

public class AllocateRandomSlot implements AllocationStrategyIF {
    private Random random = new Random();

    @Override
    public Slot allocate(List<Slot> slotList) {
        
        List<Slot> freeSlots = slotList.stream()
                .filter(s -> !s.getIsoccupied())
                .toList();

        if (freeSlots == null || freeSlots.isEmpty()) {
        	System.out.println("No free slots available!");
        	return null;
        }

        int randomIndex = random.nextInt(freeSlots.size()); // pick random index
        Slot allocatedSlot = freeSlots.get(randomIndex);        

        System.out.println("Allocated slot: " + allocatedSlot.getSlotId());
        return allocatedSlot;
    }
}
