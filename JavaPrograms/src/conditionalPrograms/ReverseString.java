package conditionalPrograms;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String args[]) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter any string:");
			String str = scanner.nextLine();
			
			char[] strArray = str.toCharArray();
			
			// Loop should start from strArray.length - 1 and go to 0
			for (int i = strArray.length - 1; i >= 0; i--) {
				System.out.print(strArray[i]); // Use print to avoid newline
			}
		}
	}
}
