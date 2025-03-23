package arrays;

public class FindPairWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 9, 2, 3, 5, 6, 1, 8, 2, 5 };
		
		int targetNumber = 15;
		findPairNumbers(arr,targetNumber);
	}

	private static void findPairNumbers(int[] arr, int targetNumber) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (i != j && arr[i] + arr[j] == targetNumber) {
					System.out.print(arr[i] + " + " + arr[j] + " = " + targetNumber);
				}
			}
		}

	}

}
