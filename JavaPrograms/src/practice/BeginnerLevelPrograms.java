package practice;

import java.util.Scanner;

public class BeginnerLevelPrograms {

	public void SwapTwoNumber() {

		int a = 5, b = 10;
		System.out.println("a =" + a + "," + "b =" + b);

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a =" + a + "," + "b =" + b);
	}

	public void EvenOrOdd(int number) {
		if (number % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");

		}
	}

	public void LeapYear(int year) {
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 == 0)) {
			System.out.println("Leap Year.");
		} else {
			System.out.println("Not a Leap Year.");
		}
	}

	public void FactorialOfNumber(int number) {
		int factorialNumber = 1;
		for (int i = number; i >= 1; i--) {
			factorialNumber *= i; // same as factorialNumber = factorialNumber * i;
		}
		System.out.println("Factorial of " + number + " is: " + factorialNumber);
	}

	public void ReverseNumberORPalindrome(int number) {
		while (number != 0) {
			int digit = number % 10;
			int reverse = 0;
			reverse = reverse * 10 + digit;
			number = number / 10;
		}
		while (number != 0) {
			int digit = number % 10;
			int sum = 0;
			sum = + digit;
			number = number / 10;
		}
	}
	public void FibonacciSeries(int number)
	{
		int first=0,second=1;
		
		for(int i=1 ; i<=number; i++)
		{
			
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
		}
	}

	public static void main(String args[]) {
		BeginnerLevelPrograms bp = new BeginnerLevelPrograms();

		bp.SwapTwoNumber();

		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter a number to check whether it is Even or Odd:");

		if (scan.hasNextInt()) {
			int number = scan.nextInt();
			bp.EvenOrOdd(number);
		} else {
			System.out.println("Incorrect input. Please enter a valid integer.");
			scan.next();
		}
		// Leap Year check
		System.out.println("\nEnter a year to check whether it is a Leap Year or not:");
		if (scan.hasNextInt()) {
			int year = scan.nextInt();
			bp.LeapYear(year);
		} else {
			System.out.println("Incorrect input. Please enter a valid integer.");
			scan.next();
		}
		// factorial of Number
		System.out.println("\nEnter a number factorial of a number:");

		if (scan.hasNextInt()) {
			int number = scan.nextInt();
			bp.FactorialOfNumber(number);

		} else {
			System.out.println("Incorrect input. Please enter a valid integer.");
			scan.next();
		}

	}
}