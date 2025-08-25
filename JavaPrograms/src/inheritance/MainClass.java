package inheritance;

public class MainClass {
	public static void main(String[] args) {
		// Base class object
		// Person person = new Person("Indu", 40, 9876543210L);
		Person person;

		// Subclass objects with upcasting
		person = new Student("Sowmya", 24, 9876543211L, "Computer Science");//	dynamic dispatch
		Person employee = new Employee("Arjun", 30, 9876543212L, "IT", "TCS", 50000.00);

		// System.out.println("----- Person -----");
		// person.getDetails();

		System.out.println("\n----- Student -----");
		person.getDetails(); // Calls overridden method

		System.out.println("\n----- Employee -----");
		employee.getDetails(); // Calls overridden method

		// final
		System.out.println("\n----- Intern -----");

		Student intern = new Intern("Arnav", 21, 9876543210L, "IT", 6);
		intern.getDetails(); // Calls the overridden method

		System.out.println("--- Static Method Calls ---");
		person.showRole(); // Role: General User
		employee.showRole(); // Role: General User
		intern.showRole(); // Role: Student

		System.out.println("\n--- Class-based Calls ---");
		Intern.showRole(); // Role: Intern (Temporary Staff)
		Employee.showRole(); // Role: Employee
		Student.showRole(); // Role: Student
		Person.showRole(); // Role: General User

	}
}
