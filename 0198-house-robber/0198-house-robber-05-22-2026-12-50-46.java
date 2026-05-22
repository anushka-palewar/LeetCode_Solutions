class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return helper(nums,dp,0);
    }

    static int helper(int nums[],int dp[],int i){
        if(i>=nums.length) return 0;
        if(dp[i]!=-1) return dp[i];

        int pick=nums[i]+helper(nums,dp,i+2);
        int notPick=helper(nums,dp,i+1);
        return dp[i]=Math.max(pick,notPick);
    }
}