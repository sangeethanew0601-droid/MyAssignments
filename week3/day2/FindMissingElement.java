package week3.day2;

import java.util.Arrays;

public class FindMissingElement {
	
	public static void main(String[] args) {
		int[] arr = {1, 4, 3, 2, 8, 6, 7};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int expectedElement = i + 1;
			if(expectedElement != arr[i]) {
				System.out.println("Missing Element: " +expectedElement);
				break;
			}
		}
	}
}
	
