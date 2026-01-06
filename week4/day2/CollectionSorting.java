package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSorting {

	public static void main(String[] args) {
		
		String[] company = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		
		List<String> list = new ArrayList<String>();
		list.add(company[0]);
		list.add(company[1]);
		list.add(company[2]);
		list.add(company[3]);
		
		Collections.sort(list);
		
		for (int i = list.size()-1; i >= 0; i--) {
			if (i != list.size()-1) {
                System.out.print(", "); 
            }
			System.out.print(list.get(i));
		}
		 
}

}
