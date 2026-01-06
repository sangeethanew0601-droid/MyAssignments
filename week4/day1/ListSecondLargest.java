package week4.day1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSecondLargest {

	public static void main(String[] args) {
		int[] array = {3, 2, 11, 4, 6, 7};
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		Collections.sort(list);
		System.out.println("Sorted list is: " +list);
		System.out.println("Second largest element in the list is " +list.get(list.size() - 2));
	}

}
