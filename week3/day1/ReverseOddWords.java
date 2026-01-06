package week3.day1;

public class ReverseOddWords {

    public static void main(String[] args) {

        String test = "I am a software tester";

        // Split the string into words
        String[] words = test.split(" ");
        
        // Traverse through each word
        for (int i = 0; i < words.length; i++) {

            // Check for odd index
            if (i % 2 != 0) {

                // Convert word to character array
                char[] chars = words[i].toCharArray();
                   
                // Reverse the characters using another loop
                for (int j = chars.length - 1; j >= 0; j--) {
                    System.out.print(chars[j]);
                }
                System.out.print(" ");

            } else {
                // Even index word printed as it is
                System.out.print(words[i] + " ");
            }
        }
    }
}