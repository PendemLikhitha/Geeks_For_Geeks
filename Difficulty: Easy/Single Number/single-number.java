// User function Template for Java

class Solution {
    int getSingle(int arr[]) {
        // code here
        int result = 0;
        for(int i:arr){
            result^=i;
        }
        return result;
    }
}