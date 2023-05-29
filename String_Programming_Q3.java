//Program to check if “2552” is palindrome or not.
public class String_Programming_Q3 {

	
	    public static boolean isPalindrome(String str) {
	        int left = 0;
	        int right = str.length() - 1;

	        while (left < right) {
	           
	            if (str.charAt(left) != str.charAt(right)) {
	                return false; 
	            }

	            left++;
	            right--;
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        String str = "2552";
	        boolean isPalin = isPalindrome(str);

	        if (isPalin) {
	            System.out.println(str + " is a palindrome.");
	        } else {
	            System.out.println(str + " is not a palindrome.");
	        }
	    }
	}

