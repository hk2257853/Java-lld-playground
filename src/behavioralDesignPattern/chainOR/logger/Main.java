package behavioralDesignPattern.chainOR.logger;

public class Main {
	public static void main(String[] args) {
		Logger logger = initialiseLogger();
		logger.logMessage(Logger.DEBUG, "hello");
	}

	static Logger initialiseLogger() {
		Logger logger = new Debug(2);
		logger.setNext(new Error(1));
		return logger;
	}
}
