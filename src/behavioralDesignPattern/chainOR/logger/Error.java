package behavioralDesignPattern.chainOR.logger;

public class Error extends Logger {
	public Error(int level) {
		this.level = level;
	}

//	@Override
//	public void handleRequest(String message) {
//		System.out.println("Error: " + message);
//	}
}
