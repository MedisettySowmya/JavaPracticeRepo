package arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 9, 2, 3, 5, 6, 1, 8, 2, 5 };
		int[] reverseArray = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {
			int j = 0;
			reverseArray[j] = arr[i];
			System.out.print(reverseArray[j] + ",");
			j++;
		}
	}

}
