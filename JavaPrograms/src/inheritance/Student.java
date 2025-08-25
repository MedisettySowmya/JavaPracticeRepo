package inheritance;

//File: Student.java
public class Student extends Person {
	String course;

	// Constructor
	public Student(String name, int age, long mobileNo, String course) {
		super(name, age, mobileNo); // Call superclass constructor
		this.course = course;
	}

	@Override
	public void getDetails() {
		System.out.println("Name     : " + getName());
		System.out.println("Age      : " + getAge());
		System.out.println("Mobile No: " + getMobileNo());
		System.out.println("Course   : " + course);
	}

	// Method to display student-specific details
	/*
	 * @Override public void getDetails() { super.getDetails(); // Inherited method
	 * System.out.println("Course: " + course); //System.out.println("Age: " + age);
	 * private members cannot access
	 * 
	 * }
	 */

	// public static void main(String[] args) {
	// Person student = new Student("Sowmya", 24, 9876543210L,"Computer Science");
	// student.getDetails();
	// }
	public static void showRole() {
		System.out.println("Role: Student");
	}

	public String getCourse() {
		return course;
	}
}
