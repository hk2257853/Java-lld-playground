package structuralDesignPattern.proxy;

public class Main {
	public static void main(String[] args) {
		// Admin proxy
		EmployeeIF admin = new EmployeeProxy("Alice", Role.ADMIN);
		admin.createEmployee("Bob", Role.USER); 
		// NOTE: I can't access Bob here. In my initial implementation, I made createEmployee return a new object, 
		// effectively creating a mini factory. In the faithful Proxy pattern (as per the course and ChatGPT), 
		// createEmployee should not create new objects — it represents a DB call or some external action, 
		// not object construction.
		admin.updateEmployee("Alice Updated");
		admin.getEmployee();

		System.out.println("----");

		// User proxy
		EmployeeIF user = new EmployeeProxy("Charlie", Role.USER);
		user.getEmployee();
		try {
			user.createEmployee("Dave", Role.USER);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

		try {
			user.updateEmployee("Charlie Updated");
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
}
