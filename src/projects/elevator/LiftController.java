package projects.elevator;

import java.util.ArrayList;
import java.util.List;

public class LiftController {
	private List<Lift> listOfLifts = new ArrayList<Lift>();
	private RequestProcessingStrategyIF requestProcessingStrategy;

	public LiftController(RequestProcessingStrategyIF requestProcessingStrategy) {
		this.requestProcessingStrategy = requestProcessingStrategy;
	}

	public void addList(Lift lift) {
		listOfLifts.add(lift);
	}

	public void requestLift(int liftIndex, int requesteFloor) {
		Lift myLift = listOfLifts.get(liftIndex);
		myLift.addRequest(requesteFloor);
	}

	public void processRequest(int liftIndex) {
		Lift myLift = listOfLifts.get(liftIndex);
		requestProcessingStrategy.processRequest(myLift.getQueue());
	}
}
