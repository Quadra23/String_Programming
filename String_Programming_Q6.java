//Program to implement Pangram Checking with least inbuilt methods being used.
public class String_Programming_Q6 {
	
	    public static boolean isPangram(String str) {
	        str = str.toLowerCase();

	        boolean[] visited = new boolean[26];

	       
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	           
	            if (ch >= 'a' && ch <= 'z') {
	                visited[ch - 'a'] = true;
	            }
	        }

	        
	        for (boolean letter : visited) {
	            if (!letter) {
	                return false;
	            }
	        }

	        return true; 
	    }

	    public static void main(String[] args) {
	        String str = "The quick brown fox jumps over the lazy dog";
	        boolean isPangram = isPangram(str);

	        if (isPangram) {
	            System.out.println(str + " is a pangram.");
	        } else {
	            System.out.println(str + " is not a pangram.");
	        }
	    }
	}

