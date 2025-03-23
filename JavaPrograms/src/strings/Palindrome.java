package strings;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter any string:");
            String str = scanner.nextLine();

            // First approach: Using character array to reverse the string
            char[] strArray = str.toCharArray();
            String reverse = ""; // Initialize reverse as an empty string

            // Reverse the string
            for (int i = strArray.length - 1; i >= 0; i--) {
                reverse += strArray[i]; // Append each character
            }

            System.out.println("Reversed string using char array: " + reverse);

            // Check if the original string and reversed string are equal
            if (str.equals(reverse)) {
                System.out.println("Palindrome string");
            } else {
                System.out.println("Not Palindrome string");
            }

            // Second approach: Using StringBuilder to reverse the string
            StringBuilder strb = new StringBuilder(str);
            String reversedStrb = strb.reverse().toString(); // Reverse once and convert to String
            System.out.println("Reversed string using StringBuilder: " + reversedStrb);

            // Check if original string and reversed string from StringBuilder are equal
            if (str.equals(reversedStrb)) {
                System.out.println("Palindrome string");
            } else {
                System.out.println("Not Palindrome string");
            }

        }
    }
}
