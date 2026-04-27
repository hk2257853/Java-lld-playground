package projects.elevator;

import java.util.Queue;

public interface RequestProcessingStrategyIF {
	public void processRequest(Queue<Integer> queue);
}
