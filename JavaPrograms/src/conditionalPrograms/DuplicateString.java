package conditionalPrograms;

import java.util.Scanner;

public class DuplicateString {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string:");
		String str = scanner.nextLine();
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			boolean isDuplicated = false;
			for (int j = 0; j < result.length(); j++) {
				if (result.charAt(j) == currentChar) {
					isDuplicated = true;
					break;
				}
			}
			if (!isDuplicated) {
				result += currentChar;
			}
		}
		System.out.println(result);

	}
}