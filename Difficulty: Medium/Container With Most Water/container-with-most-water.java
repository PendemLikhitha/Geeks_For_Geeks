//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().maxWater(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public int maxWater(int arr[]) {
        int maxWater = 0,lp = 0, rp =arr.length-1;
        while(lp<rp){
            int w = rp-lp;
            int ht = Math.min(arr[lp],arr[rp]);
            int currWt = w*ht;
            maxWater = Math.max(currWt,maxWater);
            if(arr[lp]<arr[rp]){
                lp++;}
                else{
                    rp--;}
        }
        return maxWater;
    }
}