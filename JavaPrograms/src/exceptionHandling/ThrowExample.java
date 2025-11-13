package exceptionHandling;

public class ThrowExample {
	public static void main(String[] args) {
		try {
			checkAge(18);
		} catch (CheckedCustomException e) {
			System.out.println("Caught exception: " + e.getMessage());
		}
		try {
			Checkgender('M');
		} catch (UnCheckedCustomException e) {
			System.out.println("Caught unchecked exception: " + e.getMessage());
		}
	}

	static void checkAge(int age) throws CheckedCustomException {
		if (age < 18) {
			throw new CheckedCustomException("Age must be 18 or above.");
		}
		System.out.println("Access granted.");
	}

	static void Checkgender(char gender) {
		if (gender != 'M' || gender != 'F') {
			throw new UnCheckedCustomException("gender should be M(Male) or F(Female)");
		}
	}
}
