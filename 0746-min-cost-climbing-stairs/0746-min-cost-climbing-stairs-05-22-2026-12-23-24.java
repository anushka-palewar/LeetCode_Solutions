class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //Rec+memo
        int n=cost.length;
        int dp[]=new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(helper(cost,dp,n-1),helper(cost,dp,n-2));
    }

    static int helper(int cost[],int dp[],int n){
        if(n<=1) return cost[n];
        if(dp[n]!=-1) return dp[n];
        return dp[n]=cost[n]+Math.min(helper(cost,dp,n-1),helper(cost,dp,n-2));
    }
    
}