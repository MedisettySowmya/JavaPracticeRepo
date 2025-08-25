package exceptionHandling;

public class UncheckedExceptions {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		int result;
		try {
			result = a / b;
			System.out.println(result);
		} catch (ArithmeticException ar) {
			System.out.println("Divide by Zero is not possible");
		} finally {
			System.out.println("handled exception successfully");
		}
	}
}
