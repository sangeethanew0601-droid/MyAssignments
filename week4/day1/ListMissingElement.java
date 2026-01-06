package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ListMissingElement {

    public static void main(String[] args) {
        
        // Step 1: Declare the array
        int[] array = {1, 2, 3, 4, 10, 6, 8};
        
        // Step 2: Convert the array to a List
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        
        // Step 3: Sort the list in ascending order
        Collections.sort(list);
        
        // Step 4: Check for missing numbers
        System.out.println("Missing numbers are:");
        for (int i = 0; i < list.size() - 1; i++) {
            // Step 5: Check if the current number + 1 is not equal to the next number
            int current = list.get(i);
            int next = list.get(i + 1);
            
            // If there is a gap, print the missing numbers
            if (next != current + 1) {
                for (int j = current + 1; j < next; j++) {
                    System.out.println(j); // Print the missing number
                }
            }
        }
    }
}
