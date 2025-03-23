package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseAnArray {

	public static void main(String[] args) {
        Integer[] arr = {5, 8, 9, 1, 2};

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Convert array to list and reverse
        List<Integer> list = Arrays.asList(arr);
        Collections.reverse(list);

        System.out.println("Reversed Array: " + Arrays.toString(arr));        
        

	}

}
