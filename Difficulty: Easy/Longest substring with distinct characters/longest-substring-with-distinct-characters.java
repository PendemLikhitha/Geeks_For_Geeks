//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubstr(s));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestUniqueSubstr(String s) {
            HashSet<Character> charSet = new HashSet<>();
        int start = 0; // Start pointer of the window
        int maxLength = 0; // Maximum length of substring with distinct characters
        
        // Traverse the string using the end pointer
        for (int end = 0; end < s.length(); end++) {
            // Shrink the window until there are no duplicates
            while (charSet.contains(s.charAt(end))) {
                charSet.remove(s.charAt(start));
                start++;
            }
            
            // Add the current character to the set
            charSet.add(s.charAt(end));
            
            // Update the maximum length
            maxLength = Math.max(maxLength, end - start + 1);
        }
        
        return maxLength;
    }
}