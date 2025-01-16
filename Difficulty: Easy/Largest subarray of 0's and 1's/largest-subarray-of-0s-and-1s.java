//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Create BufferedReader for efficient input reading
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read number of test cases
        int T = Integer.parseInt(br.readLine());

        // Process each test case
        while (T-- > 0) {
            // Read the entire line containing the array elements
            String line = br.readLine();

            // Split the line into an array of strings, then parse them as integers
            String[] tokens = line.split("\\s+");
            int[] a = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                a[i] = Integer.parseInt(tokens[i]);
            }

            // Create the Solution object
            Solution obj = new Solution();

            // Call maxLen function and print the result
            System.out.println(obj.maxLen(a));
        }
    }
}
// } Driver Code Ends


class Solution {
    public int maxLen(int[] arr) {
        // HashMap to store the first occurrence of a cumulative sum
        HashMap<Integer, Integer> sumIndexMap = new HashMap<>();
        int maxLength = 0; // To keep track of the maximum length
        int sum = 0;       // To keep track of the cumulative sum

        // Initialize the map with sum 0 at index -1 (for edge cases)
        sumIndexMap.put(0, -1);

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // Replace 0 with -1 for easier calculations
            sum += (arr[i] == 0) ? -1 : 1;

            // Check if the cumulative sum has been seen before
            if (sumIndexMap.containsKey(sum)) {
                // Calculate the length of the subarray
                int length = i - sumIndexMap.get(sum);
                // Update the maximum length if necessary
                maxLength = Math.max(maxLength, length);
            } else {
                // Store the first occurrence of this cumulative sum
                sumIndexMap.put(sum, i);
            }
        }

        return maxLength; 
        
    }
}
