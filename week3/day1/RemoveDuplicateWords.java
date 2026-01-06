package week3.day1;

public class RemoveDuplicateWords {

    public static void main(String[] args) {
    	
    	String text = "We learn Java basics as part of java sessions in java week1";
        int count = 0;

        // Split the string into words
        String[] words = text.split(" ");

        // Compare each word with every other word
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {

                // Case-insensitive comparison
                if (words[i].equalsIgnoreCase(words[j])) {
                    words[j] = " "; // Replace duplicate with empty string
                    count++;
                }
            }
        }

        // If duplicates were found, print result
        if (count > 0) {
            for (int i = 0; i < words.length; i++) {
            	System.out.print(words[i] + " ");
            }
        }
        else {
        	System.out.println("There are no duplicates in the given String");
        }
    }
}
