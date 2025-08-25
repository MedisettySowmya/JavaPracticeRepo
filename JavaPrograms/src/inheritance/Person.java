package inheritance;

public abstract class Person {
	private String name;
	private int age;
	private long mobileNo;

	// Constructor
	public Person(String name, int age, long mobileNo) {
		this.name = name;
		this.age = age;
		this.mobileNo = mobileNo;
	}

	// Abstract method (to be overridden by subclasses)
	public abstract void getDetails();

	// Method to display person details
	/*
	 * public void getDetails() { System.out.println("Name: " + name);
	 * System.out.println("Age: " + age);
	 * System.out.println("Mobile Number:"+mobileNo); }
	 */
	public static void showRole() {
		System.out.println("Role: General User");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public long getMobileNo() {
		return mobileNo;
	}

}
