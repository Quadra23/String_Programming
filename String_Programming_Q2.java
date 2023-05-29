//Program to print Duplicates characters from the String.
public class String_Programming_Q2 {
	
	    public static void String_Programming_Q2(String str) {
	       
	        str = str.toLowerCase();

	       
	        for (int i = 0; i < str.length(); i++) {
	            char currentChar = str.charAt(i);

	           
	            if (currentChar == ' ') {
	                continue; 
	            }

	            boolean isDuplicate = false;

	            
	            for (int j = i + 1; j < str.length(); j++) {
	                if (currentChar == str.charAt(j)) {
	                    isDuplicate = true;
	                    break;
	                }
	            }

	           
	            if (isDuplicate) {
	                System.out.println(currentChar);
	            }

	            
	            str = str.replace(currentChar, ' ');
	        }
	    }

	    public static void main(String[] args) {
	        String str = "Hello World";
	        String_Programming_Q2(str);
	    }
	}

