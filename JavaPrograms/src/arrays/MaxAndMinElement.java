package arrays;

public class MaxAndMinElement {

	public static void main(String[] args) {

		int[] arr = { 9, 2, 3, 5, 6, 1, 8 };
		int min = arr[0];
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			} else if (min > arr[i]) {
				min = arr[i];
			}

		}
		System.out.println("Minimun Value :" + min);
		System.out.println("Maximum Value :" + max);

	}

}
