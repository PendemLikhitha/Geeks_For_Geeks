class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int sumR = 0, sumL = 0;
        for(int i:arr){
            sumR += i;
        }
        for(int i = 0; i < arr.length; i++){
            sumR -= arr[i];
            if(sumL == sumR){
                return i;
            }
            sumL += arr[i];
        }
        return -1;
    }
}
