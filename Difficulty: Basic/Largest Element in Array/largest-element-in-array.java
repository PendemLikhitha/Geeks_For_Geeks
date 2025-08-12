class Solution {
    public static int largest(int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        for(int i:arr) {
            if(i > max) {
                max = i;
            }
        }
        return max;
    }
}
