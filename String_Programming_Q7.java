//Program to find if String contains all unique characters.
public class String_Programming_Q7 {
	
	    public static boolean hasUniqueCharacters(String str) {
	        for (int i = 0; i < str.length(); i++) {
	            char currentChar = str.charAt(i);

	            
	            for (int j = i + 1; j < str.length(); j++) {
	                if (currentChar == str.charAt(j)) {
	                    return false;
	                }
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        String str = "Hello World";
	        boolean hasUnique = hasUniqueCharacters(str);

	        if (hasUnique) {
	            System.out.println("The string contains all unique characters.");
	        } else {
	            System.out.println("The string does not contain all unique characters.");
	        }
	    }
	}

