//Program to implement Anagram Checking least inbuilt methods being used.
public class String_Programming_Q5 {
	
	    public static boolean isAnagram(String str1, String str2) {
	        if (str1.length() != str2.length()) {
	            return false;
	        }

	        str1 = str1.toLowerCase();
	        str2 = str2.toLowerCase();

	        int[] charCount = new int[26]; 

	       
	        for (int i = 0; i < str1.length(); i++) {
	            char ch = str1.charAt(i);
	            charCount[ch - 'a']++;
	        }

	        
	        for (int i = 0; i < str2.length(); i++) {
	            char ch = str2.charAt(i);
	            charCount[ch - 'a']--;
	        }

	        for (int count : charCount) {
	            if (count != 0) {
	                return false; 
	            }
	        }

	        return true; 
	    }

	    public static void main(String[] args) {
	        String str1 = "listen";
	        String str2 = "silent";
	        boolean isAnagram = isAnagram(str1, str2);

	        if (isAnagram) {
	            System.out.println(str1 + " and " + str2 + " are anagrams.");
	        } else {
	            System.out.println(str1 + " and " + str2 + " are not anagrams.");
	        }
	    }
	}

