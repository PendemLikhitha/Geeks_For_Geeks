class Solution {
    int floorSqrt(int n) {
        // code here
        if(n < 2)return n;
        int l = 1;
        int r = n/2;
        int result = 0;
        while(l<=r){
            int mid = (l+r)/2;
            if((long) mid*mid<=n){
                result = mid;
                l = mid+1;
            }
            else{
                r = mid -1;
            }
        }
        return result;
    }
}