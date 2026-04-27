package javaPractice;

import java.util.List;
import java.util.stream.Collectors;

// Given a list of employees, get the names of all employees with salary > 50000, sorted alphabetically

public class EmployeeStream {
	String name;
	int salary;

	public EmployeeStream(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public static void main(String[] args) {
		List<EmployeeStream> employeeList = List.of(new EmployeeStream("Harsh", 50000),
				new EmployeeStream("Raj", 100000), new EmployeeStream("hola", 25000), new EmployeeStream("bola", 100002)
		);
				
		
		List<String> names = employeeList.stream()
				.filter(e -> e.salary > 50000)
				.map(e -> e.name)
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(names);

	}

}
