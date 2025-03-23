package arrays;

public class SecondLargest {
    public static void main(String[] args) {

        int[] arr = {9, 2, 3, 2, 2, 1, 8, 15, 5, 2, 2, 2};

        int largest = Integer.MIN_VALUE;// -2,147,483,648
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == largest) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second Largest Element: " + secondLargest);
        }
    }
}