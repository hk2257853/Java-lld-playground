package projects.elevator;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class Lift {
	private Queue<Integer> queue = new ArrayDeque<>();
	private Integer currentFloor;
	List<Integer> allowedFloors;

	public Lift(List<Integer> allowedFloors) {
		// if empty floor returned
		this.allowedFloors = allowedFloors;
		currentFloor = allowedFloors.get(0);
	}

	public void addRequest(Integer floorId) {
		// is valid request
		queue.add(floorId);
	}

	public Queue<Integer> getQueue() {
		return queue;
	}

}
