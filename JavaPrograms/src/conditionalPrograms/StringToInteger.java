package conditionalPrograms;

import java.util.Scanner;

public class StringToInteger {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number as a string:");
		String str = scanner.nextLine();
		scanner.close();

		try {
			int number = Integer.parseInt(str);
			System.out.println("Converted Integer: " + number);
		} catch (NumberFormatException e) {
			System.out.println("Invalid input! Please enter a valid numeric string.");
		}
	}
}
