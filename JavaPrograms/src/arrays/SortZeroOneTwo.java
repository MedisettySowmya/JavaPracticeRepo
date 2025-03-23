package arrays;

import java.util.Arrays;

public class SortZeroOneTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 0, 2, 1, 1, 0 };
		Arrays.sort(arr);
		for (int num : arr) {
			System.out.print(num + ",");
		}
	}
}
