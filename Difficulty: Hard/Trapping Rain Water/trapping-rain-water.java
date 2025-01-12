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


class Solution {
    public int maxWater(int arr[]) {
        int total=0,LMax = 0,RMax =0;
        int l=0;
        int r=arr.length-1;
        while(l<r){
            if(arr[l]<=arr[r]){
                if(LMax>arr[l]){
                    total+=LMax-arr[l];
                }
                else{
                    LMax = arr[l];
                }
                l++;
            }
            else{
                if(RMax>arr[r]){
                    total+=RMax-arr[r];
                }
                else{
                    RMax=arr[r];
                }
                r--;
            }
        }
        return total;
    }
}
