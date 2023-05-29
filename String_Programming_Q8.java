
public class String_Programming_Q8 {
	
	    public static char findMaximumOccurringCharacter(String str) {
	        int[] charCount = new int[256];

	       
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            charCount[ch]++;
	        }

	        char maxChar = ' ';
	        int maxCount = 0;

	      
	        for (int i = 0; i < charCount.length; i++) {
	            if (charCount[i] > maxCount) {
	                maxChar = (char) i;
	                maxCount = charCount[i];
	            }
	        }

	        return maxChar;
	    }

	    public static void main(String[] args) {
	        String str = "Hello World";
	        char maxChar = findMaximumOccurringCharacter(str);

	        System.out.println("The maximum occurring character is: " + maxChar);
	    }
	}

