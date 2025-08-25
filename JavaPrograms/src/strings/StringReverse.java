package strings;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// String str = scanner.nextLine();
		// System.out.println("Enter String:");

		String str2 = "Medisetty Sowmya";

		String[] word = str2.split(" ");
		// Sowmya Medisetty
		System.out.println(word[1] + " " + word[0]);
		// aymwoS yttesideM
		String reversed = "";
		for (int i = str2.length() - 1; i >= 0; i--) {
			reversed += str2.charAt(i);
		}
		System.out.println(reversed);
		// yttesideM aymwoS
		char[] charArray = str2.toCharArray();
		String firstWord = "";
		String secondWord = "";

		// Reverse first word
        for (int i = word[0].length() - 1; i >= 0; i--) {
            firstWord += word[0].charAt(i);
        }
        
        for(int i=word[1].length()-1;i>=0;i--)
        {
        	secondWord+=word[1].charAt(i);
        }
        System.out.println(firstWord + " "+secondWord);


	}

}
