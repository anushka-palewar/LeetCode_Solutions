class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int dp[][]=new int[n+2][2];

        for(int i=n-1;i>=0;i--){
            dp[i][1]=Math.max( //buy stock
                -prices[i]+dp[i+1][0], //mai kharid rahi hu isliye -price
                dp[i+1][1]
            );

            dp[i][0]=Math.max( //sell stock
                prices[i]+dp[i+2][1], //mujhe paise milre hai isliye +price
                dp[i+1][0]
            );
        }
        return dp[0][1];
    }
}