package week4.day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIntersection {

	public static void main(String[] args) {
		
		int[] array1 = {3, 2, 11, 4, 6, 7};
		int[] array2 = {1, 2, 8, 4, 9, 7};
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(array1[0]);
		list1.add(array1[1]);
		list1.add(array1[2]);
		list1.add(array1[3]);
		list1.add(array1[4]);
		list1.add(array1[5]);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(array2[0]);
		list2.add(array2[1]);
		list2.add(array2[2]);
		list2.add(array2[3]);
		list2.add(array2[4]);
		list2.add(array2[5]);
		
		for (int i = 0; i < list1.size(); i++) {
			for(int j = 0; j < list2.size(); j++) {
				if(list1.get(i)==list2.get(j)) {
					System.out.println("The intersection in the list is: " +list1.get(i));
				}
				}
			}
		}
	}