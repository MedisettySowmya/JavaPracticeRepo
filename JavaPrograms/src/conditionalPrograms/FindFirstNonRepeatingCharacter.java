package conditionalPrograms;

import java.util.Scanner;

public class FindFirstNonRepeatingCharacter {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter any string");
			String str = scanner.nextLine();
			boolean found = false;
			for (int i = 0; i < str.length(); i++) {
				char currentChar = str.charAt(i);
				boolean isNonRepatingchar = true;

				for (int j = 0; j < str.length(); j++) {
					if (i != j && str.charAt(i) == str.charAt(j)) {
						isNonRepatingchar = false;
						break;
					}

				}
				if (isNonRepatingchar) {
					System.out.println("First non-repeating character: " + currentChar);
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println("No non-repeating character found");

			}
		}

	}

}
