package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearningSet {

	public static void main(String[] args) {
		
		String companyName = "google";
		
		//Convert the String to charArray to iterate each character
		char[] charArray= companyName.toCharArray();
		
		// Created a empty set
		Set<Character> addUniqueCharacter = new LinkedHashSet<Character>();
		
		//Iterating each character
		for (int i = 0; i < charArray.length; i++) {
			addUniqueCharacter.add(charArray[i]); // adding char to the set (by LinkedHashSet) 
		}
		
		//Print the Set
		System.out.println(addUniqueCharacter);

	}
}
