class Solution {
    int dp[][][];
    public int maxProfit(int k, int[] prices){
        int n=prices.length;
        dp=new int[n][2][k+1];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < 2; j++)
                Arrays.fill(dp[i][j], -1);


        return helper(0,1,k,prices);
    }

    public int helper(int i,int buy,int k,int prices[]) {
        if(i==prices.length || k==0) return 0;
        if(dp[i][buy][k]!=-1) return dp[i][buy][k];

        int profit;

        if (buy == 1) {
            profit = Math.max(
                -prices[i] + helper(i+1,0,k,prices),
                helper(i+1,1,k,prices)
            );
        } else {
            profit = Math.max(
                prices[i] + helper(i+1,1,k-1,prices),
                helper(i+1,0,k,prices)
            );
        }

        return dp[i][buy][k] = profit;
    }
}