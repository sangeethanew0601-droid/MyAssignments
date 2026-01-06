package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		
		String companyName="TestLeaf";
		String emptyString="";
		
		for(int i=companyName.length()-1;i>=0;i--) {
			emptyString=emptyString+companyName.charAt(i);
		}
		System.out.println(emptyString);
		
		if(companyName.equals(emptyString))
		{
			System.out.println("String is a palindrome");
		}
		else {
			System.out.println("String is not a palindrome");
		}
	}

}
