package methodArguments;

public class MethodArgumentsExample {
	public void employeeDetails(int empId, String empName) { // passing by values
		System.out.println("Employee Id: " + empId + "\n" + "Employee Name: " + empName);

	}

	public void employeeDesignation(String designation) {
		System.out.println("Employee Desigation : " + designation);
	}

	public void employeeInfo(Employee emp) {
		System.out.println("Employee Id: " + emp.id + "\n" + "Employee Name: " + emp.name + "\n"
				+ "Employee Designation :" + emp.designation);
	}

	public void employeeProjects(String... projects) {
		for (String project : projects) {
			System.out.println("- " + project);
		}
	}
	public void employeeSalary(final double salary)
	{
		//salary=30000;
		System.out.println("Employee Salary :"+ salary);
	}

	public static void main(String[] args) {
		MethodArgumentsExample obj = new MethodArgumentsExample();

		// Primitive arguments
		obj.employeeDetails(1, "Sowmya");

		// String argument
		String designation = "QA";
		obj.employeeDesignation(designation);

		// Object argument
		Employee emp1 = new Employee();
		emp1.id = 101;
		emp1.name = "John";
		emp1.designation = "Developer";
		obj.employeeInfo(emp1);
		
		// Varargs
        obj.employeeProjects("Banking App", "E-commerce Site", "AI Chatbot");
        
        obj.employeeSalary(400000);

	}
}
