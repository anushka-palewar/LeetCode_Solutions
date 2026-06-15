class Solution {
    public int change(int amount, int[] coins) {
        int dp[][]=new int[coins.length][amount+1];
        for (int[] row:dp) {
            Arrays.fill(row, -1);
        }
        return coinCount(0,coins,amount,dp);
    }
    public int coinCount(int i, int[] coins, int amount, int[][] dp) {
        if (amount == 0) return 1;
        if (i == coins.length) return 0;

        if(dp[i][amount] != -1) {
            return dp[i][amount];
        }
        int notPick = coinCount(i + 1, coins, amount, dp);
        int pick=0;
        if(amount-coins[i] >= 0) {
            pick = coinCount(i,coins,amount-coins[i],dp);
        }
        
        return dp[i][amount]=pick+notPick;
    }
}