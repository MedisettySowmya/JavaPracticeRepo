package strings;

import java.util.Scanner;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter string:");

            String str = scanner.nextLine();
            String result = removeDuplicates(str);

            System.out.println("String after removing duplicates: " + result);
        }
    }

    public static String removeDuplicates(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isDuplicate = false;

            // Check if character already exists in result
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == currentChar) {
                    isDuplicate = true;
                    break;
                }
            }

            // Append only if it's not a duplicate
            if (!isDuplicate) {
                result += currentChar;  // String concatenation (less efficient)
            }
        }
        return result;
    }
}
