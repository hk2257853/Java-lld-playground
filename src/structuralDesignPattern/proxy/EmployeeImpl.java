package structuralDesignPattern.proxy;

public class EmployeeImpl implements EmployeeIF {
	Role role;
	String employeeName;

	EmployeeImpl(String name, Role role) {
		employeeName = name;
		this.role = role;
	}

	@Override
	public void createEmployee(String employeeName, Role role) {
		System.out.println("Created successfully " + employeeName + ", Role: " + role);
		// irl it will be a db call or something
	}

	@Override
	public void updateEmployee(String employeeName) {
		this.employeeName = employeeName;
		System.out.println("Updated succesfully " + this.employeeName);
	}

	@Override
	public void getEmployee() {
		System.out.println("Employee details -> Name: " + this.employeeName + ", Role: " + this.role);
	}

}
