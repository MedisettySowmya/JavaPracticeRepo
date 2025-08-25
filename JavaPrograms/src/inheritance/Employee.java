package inheritance;

public class Employee extends Student {
	private String company;
	private double salary;

	// Constructor
	public Employee(String name, int age, long mobileNo, String course, String company, double salary) {
		super(name, age, mobileNo, course); // Call superclass constructor
		this.company = company;
		this.salary = salary;
	}

	// Overriding getDetails()
	@Override
	public void getDetails() {
		super.getDetails(); // Student's getDetails()
		System.out.println("Company  : " + company);
		System.out.println("Salary   : ₹" + salary);
	}

	public static void showRole() {
		System.out.println("Role: Employee");
	}

	public String getCompany() {
		return company;
	}

	public double getSalary() {
		return salary;
	}

	// public static void main(String[] args) {
//	 Person student = new Student("Sowmya", 24, 9876543210L,"Computer Science");
//     Student employee = new Employee("Sowmya", 24,9876543210L, "Computer Science","Cognine Technologies",25000);
//     employee.getDetails();
// }
}
