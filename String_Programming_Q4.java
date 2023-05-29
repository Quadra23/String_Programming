//Program to count the number of consonants, vowels, special characters in a String.
public class String_Programming_Q4 {
	
	    public static void countCharacters(String str) {
	        int vowelsCount = 0;
	        int consonantsCount = 0;
	        int specialCharCount = 0;

	        str = str.toLowerCase();

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            // Check if the character is a letter
	            if (Character.isLetter(ch)) {
	                // Check if the character is a vowel
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                    vowelsCount++;
	                } else {
	                    consonantsCount++;
	                }
	            } else {
	                specialCharCount++;
	            }
	        }

	        System.out.println("Number of vowels: " + vowelsCount);
	        System.out.println("Number of consonants: " + consonantsCount);
	        System.out.println("Number of special characters: " + specialCharCount);
	    }

	    public static void main(String[] args) {
	        String str = "Hello World!";
	        countCharacters(str);
	    }
	}
