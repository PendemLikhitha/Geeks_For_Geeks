// User function Template for Java

class Solution {
    public int countWays(int n) {
        // code here
        int dp[] = new int[n+1];
        dp[0] = 1;
        if(n>=1)dp[1]=1;
        if(n>=2)dp[2]=1;
        if(n>=3)dp[3]=2;
        for(int i = 4; i<=n ;i++){
            dp[i] = dp[i-1]+dp[i-4]+dp[i-3];
        }
        return dp[n];
        
    }
};