package oops;

public class MethodOverloading {

	int add(int a, int b) {
		return a + b;
	}

	double add(double a, double b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		MethodOverloading cal = new MethodOverloading();
		System.out.println(cal.add(50, 10));
		System.out.println(cal.add(5.5, 600));
		System.out.println(cal.add(5, 60, 30));

	}
}
