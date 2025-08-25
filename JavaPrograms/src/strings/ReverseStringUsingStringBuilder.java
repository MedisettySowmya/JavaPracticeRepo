package strings;

public class ReverseStringUsingStringBuilder {

	// Swap words in the sentence (handles more than two words)
	public static void swapWords(String str) {
		String[] words = str.split(" ");
		if (words.length >= 2) {
			StringBuilder swapped = new StringBuilder();
			for (int i = words.length - 1; i >= 0; i--) {
				swapped.append(words[i]).append(" ");
			}
			System.out.println("Swapped Words: " + swapped.toString().trim());
		} else {
			System.out.println("Invalid input");
		}
	}

	// Reverse each character separately
	public static void reverseEachWord(String str) {
		String[] words = str.split(" ");
		StringBuilder result = new StringBuilder();

		for (String word : words) {
			result.append(new StringBuilder(word).reverse()).append(" ");
		}

		System.out.println("Reversed Each character: " + result.toString().trim());
	}

	// reverse entire string
	public static void reverseEntireSting(String str) {
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}
		System.out.println("Reverse entire string:" + reversed);
	}

	public static void main(String args[]) {
		String str = "Medisetty Sowmya";

		System.out.println("Original: " + str);
		System.out.println();

		swapWords(str);
		System.out.println();

		reverseEachWord(str);
		System.out.println();
		
		reverseEntireSting(str);
	}
}
