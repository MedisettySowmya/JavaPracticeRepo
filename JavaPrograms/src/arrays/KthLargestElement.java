package arrays;

import java.util.Arrays;

public class KthLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 9, 2, 3, 2, 2, 1, 8, 15, 5, 2, 2, 2 };
		int k = 2;
		for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr);
		}
		System.out.print(arr[arr.length - k]);

	}

}
