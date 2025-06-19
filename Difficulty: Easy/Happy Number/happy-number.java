// User function Template for Java

class Solution {

    static int isHappy(int N) {
        // code here
        HashSet<Integer> h = new HashSet<>();
        while(true){
            int v = 0;
            while(N>0){
                int r = N%10;
                v += r*r;
                N/=10;
            }
            if(v==1)return 1;
            else if(h.contains(v))return 0;
            h.add(v);
            N = v;
        }
    }
}