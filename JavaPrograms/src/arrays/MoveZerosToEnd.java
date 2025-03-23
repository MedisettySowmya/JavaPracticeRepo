package arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 9, 2, 0, 3, 5, 0, 6, 8 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[count] = arr[i];
				count++;
			}
		}
		while (count < arr.length) {
			arr[count] = 0;
			count++;
		}
		//Final Array
		for (int num : arr) {
			System.out.print(num + ",");
		}

	}
}
