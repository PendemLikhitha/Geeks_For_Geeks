// User function Template for Java

class Solution {
    public int gcd(int n, int arr[]) {
        // code here.
        int result = arr[0];
        for(int i = 1;i<arr.length;i++){
            result = gcdTwo(result,arr[i]);
        }
        return result;
    }
    public int gcdTwo(int a,int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}