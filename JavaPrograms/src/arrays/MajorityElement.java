package arrays;

public class MajorityElement {

	public static void main(String[] args) {
		int[] arr = { 9, 2, 3, 2,2, 1, 8, 2, 5, 2,2,2 };
		int majorityElement = findMajorityElement(arr);
		System.out.println("Majority Element: " + majorityElement);
	}

	public static int findMajorityElement(int[] arr) {
		int maxCount = 0;
		int majorityElement = -1;

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}

			if (count > maxCount) {
				maxCount = count;
				majorityElement = arr[i];
			}
		}
		if (maxCount > arr.length / 2) {
			return majorityElement;
		} else {
			return -1;
		}

	}
}