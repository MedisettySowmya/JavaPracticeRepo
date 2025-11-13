package practice;

import java.util.Arrays;
import java.util.Scanner;

public class IntermediateLevelPrograms {

	public void LargestAndSmallestumberInArray() {
		int[] arr = { 2, 4, 9, 5, 8, 5, 1 };
		int large = arr[0];
		int small = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > large) {
				large = arr[i];
			} else if (arr[i] < small && arr[i] != large) {
				small = arr[i];
			}
		}
		System.out.println("Largest Number:" + large);
		System.out.println("Smallest Number:" + small);
	}

	public void ReverseAnArray() {
		int[] arr = { 2, 4, 9, 5, 8, 5, 1 };

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

	public void RemoveDuplicateElements() {
		int[] arr = { 2, 4, 9, 5, 2, 5, 2 };
		int[] temp = new int[arr.length];
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicated = false;
			for (int j = 0; j < index; j++) {
				if (arr[i] == temp[j]) {
					isDuplicated = true;
					break;
				}

			}
			if (!isDuplicated) {
				temp[index] = arr[i];
				index++;
			}

		}
		// Print unique elements
		System.out.println("\nArray without duplicates: ");
		for (int i = 0; i < index; i++) {
			System.out.print(temp[i] + " ");
		}
	}

	public void SecondLargestElement() {
		int[] arr = { 2, 4, 9, 5, 2, 5, 8, 2 };
		int firstLarge = arr[0];
		int secondLarge = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > firstLarge) {
				secondLarge = firstLarge;
				firstLarge = arr[i];
			}
			if (arr[i] > secondLarge && arr[i] != firstLarge) {
				secondLarge = arr[i];
			}

		}
		System.out.println("First Large:" + firstLarge);
		System.out.println("Second Large:" + secondLarge);

	}

	public void FrequencyofStrings() {
		String str = "Hello World";
		char[] ch = str.toCharArray();
		boolean[] visited = new boolean[ch.length];

		for (int i = 0; i < str.length(); i++) {

			if (visited[i] || ch[i] == ' ') {

				continue;
			}
			int count = 1;

			for (int j = i + 1; j < ch.length; j++) {

				if (ch[i] == ch[j]) {
					++count;
					visited[j] = true;

				}
			}
			System.out.println(ch[i] + " :" + count);
		}
	}

	public void ReverseEachWord() {
		String name = "Sowmya Medisetty";
		String[] words = name.split(" ");
		for (String word : words) {
			for (int i = word.length() - 1; i >= 0; i--) {
				System.out.print(word.charAt(i));

			}
			System.out.print(" ");
		}

	}

	public void DuplicateWords() {
		String sentence = "This is a test This is only a test can write";
		sentence = sentence.toLowerCase();

		String[] words = sentence.split(" ");
		boolean[] visited = new boolean[words.length];

		for (int i = 0; i < words.length; i++) {

			if (visited[i]) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					visited[j] = true;

				}
			}

			System.out.println(words[i] + " Count :" + count);
			visited[i] = true;
		}
	}

	public void DuplicateWordsanotherway() {
		String sentence = "This is a test This is only a test can write";
		sentence = sentence.toLowerCase();

		String[] words = sentence.split(" ");

		for (int i = 0; i < words.length; i++) {
			boolean isDuplicatedWord = false;

			for (int j = 0; j < i; j++) {
				if (words[i].equals(words[j])) {
					isDuplicatedWord = true;
					break;
				}
			}
			if (isDuplicatedWord) {
				continue;
			}
			int count = 1;

			for (int k = i + 1; k < words.length; k++) {
				if (words[i].equals(words[k])) {
					count++;
				}

			}

			System.out.println(words[i] + " : " + count);
			// visited[i] = true;
		}
	}

	public void reverse() {
		String str = "Sowmya";
		int reverse;
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

	public void Anagram() {
		String str1 = "Sowmya";
		String str2 = "medisetty";
		if (str1 == str2) {
			System.out.println("Not anagram");
		} else {
			char[] arr1 = str1.toCharArray();
			char[] arr2 = str2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2)) {
				System.out.println("anagram");

			} else {
				System.out.println("Not anagram");

			}

		}
	}

	public void ConvertCMtoMeter() {
		int cm = 10000;
		int meters;
		meters = cm / 100;
		System.out.println("Meters:" + meters);

	}

	public void DuplicateString() {
		String name = "sowmya M";
		name = name.toLowerCase();
		int vowelsCount = 0;
		int consonantsCount = 0;

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch == ' ')
				continue;
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelsCount++;
			} else {
				consonantsCount++;

			}
		}
		System.out.println("vowel counts:" + vowelsCount + "\n consonants count:" + consonantsCount);

	}

	public void palindrome() {
		String str = "madam";
		String original = str.toLowerCase();
		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			reverse += original.charAt(i);

		}
		if (reverse.equals(original)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");

		}
	}

	public void frequencyofstring() {
		String str = "Hello world";
		char[] ch = str.toCharArray();
		boolean[] visited = new boolean[ch.length];

		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			if (visited[i] || ch[i] == ' ')
				continue;
			for (int j = 0; j < ch.length; j++) {

				if (ch[i] == ch[j]) {
					count++;
					visited[j] = true;

				}
			}
			System.out.println(ch[i] + " count of charcters:" + count);
			visited[i] = true;
		}
	}

	public void reverseEachWordinArray() {
		String name = "Sowmya Medisetty";
		name = name.toLowerCase();
		String[] words = name.split(" ");
		String[] temp = new String[words.length];

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reversed = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				reversed += word.charAt(j);
			}

			temp[i] = reversed;
		}

		for (String eachWord : temp) {
			System.out.print(eachWord + " ");
		}
	}

	public void removeDuplicatedwordsInArray() {
		String message = "This is my text is";
		message = message.toLowerCase();
		String[] words = message.split(" ");
		String[] temp = new String[words.length];
		boolean[] visited = new boolean[words.length];
		System.out.println();
		for (int i = 0; i < words.length; i++) {
			if (visited[i])
				continue;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					visited[j] = true;
				}

			}
			System.out.print(words[i] + " ");
			visited[i] = true;
		}

	}

	public void RightAngle() {
		int rows = 4;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void Pyramid() {
		int rows = 5;
		for (int i = 1; i <= rows; i++) {
			for (int j = i; j <= rows; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

	public void InvertedTringle() {
		System.out.println("Inverted Tringle");

		int rows = 5;
		for (int i = 0; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	public void InvertedPyramid() {
		int rows = 5;
		for (int i = rows; i >= 1; i--) {
			for (int j = rows; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k < i; k++) {
				System.out.print("* ");
			}
			System.out.println();

		}

	}

	public void KthLargestElement() {
		int[] numbers = { 2, 6, 9, 3, 6, 10 };
		int k = 2;
		for (int i = 0; i < numbers.length; i++) {
			Arrays.sort(numbers);
		}
		System.out.println(numbers[numbers.length - k]);
	}

	public void majorityElement() {
		int[] numbers = { 2, 6, 9, 3, 6, 10 };
		int count = 1;
		int maxCount = 1;
		int majorityElement = -1;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 1; j < numbers.length; j++) {
				if (i != j && numbers[i] == numbers[j]) {
					count++;

				}
			}
			if (count > maxCount) {
				maxCount = count;
				majorityElement = numbers[i];
			}
		}
		System.out.println("Element " + majorityElement + " Count is " + maxCount);

	}

	public void MoveZerosToEnd() {
		int[] numbers = { 2, 6, 0, 9, 3, 0, 6, 10 };
		int count = 0;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] != 0) {
				numbers[count] = numbers[i];
				count++;
			}
		}
		while (count < numbers.length) {
			numbers[count] = 0;
			count++;
		}

		for (int arr : numbers) {
			System.out.print(arr + ",");
		}

	}

	public void subStringOccurrence() {
		String mainStr = "Cognine Technologies";
		String subStr = "o";
		mainStr = mainStr.toLowerCase();
		int index = 0;
		index = mainStr.indexOf(subStr);
		int count = 0;
		while (index != -1) {
			index = mainStr.indexOf(subStr, index + 1);
			count++;
		}
		System.out.print("Sub String " + subStr + " occured " + count + "times");

	}
	/*
	 * public void p() {
	 * 
	 * int arr={14, 0, 5, 2, 0, 3, 0}; int index=0; for(int i=0;i<arr.length;i++) {
	 * if(arr[i]==0) { arr[index]=arr[i]; index++; } } for(int j=
	 * 0;j<arr.length;j++) { if(arr[i]!=0 && index<arr.length) { arr[index]==arr[j];
	 * index++; } }
	 */

	public static void main(String args[]) {
		IntermediateLevelPrograms bp = new IntermediateLevelPrograms();

		/*
		 * bp.LargestAndSmallestumberInArray(); bp.ReverseAnArray();
		 * 
		 * bp.RemoveDuplicateElements(); bp.SecondLargestElement();
		 * bp.FrequencyofStrings();
		 * 
		 * bp.ReverseEachWord();
		 * 
		 * // bp.DuplicateWords(); // bp.DuplicateWordsanotherway(); bp.reverse();
		 * bp.RemoveDuplicateElements(); bp.Anagram(); bp.ConvertCMtoMeter();
		 * bp.DuplicateString(); bp.palindrome(); bp.frequencyofstring();
		 * bp.DuplicateWords(); bp.reverseEachWordinArray();
		 * bp.removeDuplicatedwordsInArray();
		 */
		// bp.RightAngle();
		// bp.Pyramid();
		// bp.InvertedTringle();
		// bp.InvertedPyramid();
		// bp.KthLargestElement();
		// bp.majorityElement();
		// bp.MoveZerosToEnd();
		bp.subStringOccurrence();

	}
}
