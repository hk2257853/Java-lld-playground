package structuralDesignPattern.proxy;

public class EmployeeProxy implements EmployeeIF {
	EmployeeImpl employee;

	// Wraps a real EmployeeImpl representing the caller
	// Needed so the proxy can check the caller's role and delegate actions
	// (This isn’t a creational pattern — the purpose of this object is not to
	// create employees, it just represents the real subject being accessed)
	// In my first attempt, I got stuck in a "deadlock" — couldn't create the first
	// proxy to create more users lol
	public EmployeeProxy(String name, Role role) {
		this.employee = new EmployeeImpl(name, role);
	}

	@Override
	public void createEmployee(String employeeName, Role role) {
		if (employee.role == Role.ADMIN) {
			employee.createEmployee(employeeName, role);
			return;
		}
		throw new RuntimeException("Access Denied for create");
	}

	@Override
	public void updateEmployee(String employeeName) {
		if (employee.role == Role.ADMIN) {
			employee.updateEmployee(employeeName);
			return;
		}
		throw new RuntimeException("Access Denied for update");
	}

	@Override
	public void getEmployee() {
		if (employee.role == Role.ADMIN || employee.role == Role.USER) {
			employee.getEmployee();
			return;
		}
		throw new RuntimeException("Access Denied for get");
	}
}
