package arrays;

public class MinMaxArray {
	public static void main(String[] args) {

		// Sample input array (you can modify or take input from user)
		int[] arr = { 5, 8, 9, 1, 2 };

		// Initializing min and max to the first element of the array
		int minValue = arr[0];
		int maxValue = arr[0];

		// Loop to find min and max in O(n) time
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < minValue) {
				minValue = arr[i]; // Update min
			}
			if (arr[i] > maxValue) {
				maxValue = arr[i]; // Update max
			}
		}

		// Output results
		System.out.println("Minimum Value: " + minValue);
		System.out.println("Maximum Value: " + maxValue);

	}
}
