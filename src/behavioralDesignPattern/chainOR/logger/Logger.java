package behavioralDesignPattern.chainOR.logger;

public abstract class Logger {
	public static final int DEBUG = 2;
	public static final int ERROR = 1;
	int level;
	Logger nextProcessor;

	void handleRequest(String message) {
		System.out.println(this.getClass().getCanonicalName() + " " +  message); 
		// personal variant where i wrote the logger here in place of overriding in each class
	};

	public void setNext(Logger nextProcessor) {
		this.nextProcessor = nextProcessor;		
	}

	public void logMessage(int level, String message) {
		if (this.level <= level) {
			handleRequest(message);
		}
		
		if (this.nextProcessor != null) {
			this.nextProcessor.logMessage(level, message);
		}
	}
}
