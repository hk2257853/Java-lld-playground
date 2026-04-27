package projects.elevator;

import java.util.Queue;

public class FIFOStrategy implements RequestProcessingStrategyIF {

	@Override
	public void processRequest(Queue<Integer> queue) {
		while (!queue.isEmpty()) { // I feel i should put this function in an abstract class
			Integer currentRequest = queue.poll(); // and take currentRequest as an arg. 
			System.out.println("Processing in lift: " + currentRequest);
		}
	}

}
