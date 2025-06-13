// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int c = 0,num = n;
        while(num>0){
            int d = num%10;
            if(d!=0 && n%d==0){
                c++;
            }
            num/=10;
        }
        return c;
    }
}