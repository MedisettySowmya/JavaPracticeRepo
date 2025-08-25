package exceptionHandling;

public class ErrorHandling {

	public static void main(String[] args) {
		try {
			recursiveMethod();// Start infinite recursion
		} catch (StackOverflowError er) {
			System.out.println("Caught StackOverflowError! Stopping recursion.");
		}
	}
	static void recursiveMethod() {
		recursiveMethod();// Call itself again without stopping
	}

}
