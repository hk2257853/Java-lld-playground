package structuralDesignPattern.proxy;

public interface EmployeeIF {
		
	public void createEmployee(String employeeName, Role role);

	public void updateEmployee(String employeeName);

	public void getEmployee();
}
