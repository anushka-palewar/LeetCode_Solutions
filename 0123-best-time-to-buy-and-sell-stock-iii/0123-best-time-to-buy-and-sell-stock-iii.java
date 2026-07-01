class Solution {
    int dp[][][];
    public int maxProfit(int[] prices) {
        int n=prices.length;
        dp=new int[n][2][3];

        for(int i=0;i<n;i++)
            for(int j=0;j<2;j++)
                Arrays.fill(dp[i][j],-1);

        return helper(0,1,2,prices);
    }

    public int helper(int i,int buy,int cap,int prices[]){
        if(i==prices.length || cap==0) return 0;
        if(dp[i][buy][cap]!=-1) return dp[i][buy][cap];

        if(buy==1){
            return dp[i][1][cap]=Math.max(
                -prices[i]+helper(i+1,0,cap,prices),
                helper(i+1,1,cap,prices)
            );
        }

        return dp[i][0][cap]=Math.max(
            prices[i]+helper(i+1,1,cap-1,prices),
            helper(i+1,0,cap,prices)
        );

    }
}