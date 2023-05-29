//Program to remove Duplicates from a String.(Taking any String ex with duplicates character)
public class String_Programming_Q1 {
	
	    public static String removeDuplicates(String str) {
	        String result = "";

	        for (int i = 0; i < str.length(); i++) {
	            char currentChar = str.charAt(i);

	            if (result.indexOf(currentChar) == -1) {
	                result += currentChar;
	            }
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        String str = "Hello World";
	        String result = removeDuplicates(str);
	        System.out.println(result);
	    }
	}

