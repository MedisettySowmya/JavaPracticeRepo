package conditionalPrograms;

import java.util.Scanner;

public class SubstringOccurrence {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter main string");
			String mainStr = scanner.nextLine();
			System.out.println("Enter sub string");
			String subStr = scanner.nextLine();

			int index = mainStr.indexOf(subStr);
			int count = 0;
			while (index != -1) {
				count++;
				index = mainStr.indexOf(subStr, index + 1); // Move just 1 step forward
			}

			System.out.println(subStr + " " + "Occurrences: " + count);
		}
	}
}
