class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        Integer dp[][]=new Integer[nums.length][2001];
        return helper(0,0,nums,target,dp);
    }

    static int helper(int i,int sum,int nums[],int tar,Integer dp[][]){
        if(i==nums.length){
            return sum == tar ? 1 : 0;
        }
        if(dp[i][sum+1000]!=null) return dp[i][sum+1000];

        int add=helper(i+1,sum+nums[i],nums,tar,dp);
        int sub=helper(i+1,sum-nums[i],nums,tar,dp);

        return dp[i][sum+1000]=add+sub;
    }
}