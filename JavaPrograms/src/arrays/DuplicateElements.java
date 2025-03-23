package arrays;

public class DuplicateElements {

    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 5, 6, 1, 8, 2, 5};
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicated = false;

            for (int j = 0; j < arr.length; j++) { // Start from 0 instead of 1
                if (i != j && arr[i] == arr[j]) {
                    isDuplicated = true;
                    System.out.println(arr[i]); // Print the first time
                    break; // Break to avoid repeated prints
                }
            }
        }
    }
}
