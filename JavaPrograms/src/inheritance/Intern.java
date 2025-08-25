package inheritance;

public final class Intern extends Student {
	private final int duration;
	private final double stipend = 12000;

	public Intern(String name, int age, long mobileNo, String course, int duration) {
		super(name, age, mobileNo, course);
		this.duration = duration;
	}

	// overriding of getDetails()
	@Override
	public final void getDetails() {
		System.out.println("Name     : " + getName());
		System.out.println("Age      : " + getAge());
		System.out.println("Mobile No: " + getMobileNo());
		System.out.println("Course   : " + getCourse());
		System.out.println("Duration : " + duration + " months");
		System.out.println("Stipend  : ₹" + stipend);
	}

	public static void showRole() {
		System.out.println("Role: Intern (Temporary Staff)");
	}
}
