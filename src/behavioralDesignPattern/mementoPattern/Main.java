package behavioralDesignPattern.mementoPattern;

public class Main {
	public static void main(String[] args) {
		State s1 = new State(1, "10:00");
		State s2 = new State(2, "10:01");
		State s3 = new State(3, "10:02");
		State s4 = new State(4, "10:02");
		Originator originator = new Originator(s1);

		MementoIF m1 = originator.saveStateToMemento();
		originator.setState(s2);
		MementoIF m2 = originator.saveStateToMemento();
		originator.setState(s3);
		MementoIF m3 = originator.saveStateToMemento();
		originator.setState(s4);
		MementoIF m4 = originator.saveStateToMemento();

		CareTaker careTaker = new CareTaker();
		careTaker.add(m1); // ok i can only add memento to careTake. why we need memento as middle man?
		careTaker.add(m2);

		System.out.println("Current state of originator: " + originator.getState().getPage());
		
		// restoring snapshot
		originator.restoreStateFromMemento(careTaker.getLastMemento());
		System.out.println("Restored to: " + originator.getState().getPage());
		originator.restoreStateFromMemento(careTaker.getLastMemento());
		System.out.println("Restored to: " + originator.getState().getPage());

	}
}
