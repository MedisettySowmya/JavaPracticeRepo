package conditionalPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter string 1:");
			String str1 = scanner.nextLine();
			System.out.println("Enter String 2");
			String str2 = scanner.nextLine();
			if (str1.length() != str2.length()) {
				System.out.println("Not anagrams");
			} else {
				char[] arr1 = str1.toCharArray();
				char[] arr2 = str2.toCharArray();

				Arrays.sort(arr1);
				Arrays.sort(arr2);
				if (Arrays.equals(arr1, arr2)) {
					System.out.println("Anagram");
				} else {
					System.out.println("Not Anagram");

				}

			}
		}

	}

}
