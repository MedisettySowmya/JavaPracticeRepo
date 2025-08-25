package strings;

import java.util.Scanner;

public class ConvertCMtoMeter {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter centimenters");

		int cm = scanner.nextInt();
		int meters = cm / 100;
		System.out.println("No of Meters :" + meters);
	}
}
