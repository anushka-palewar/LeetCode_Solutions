class Solution {
    public int rob(int[] nums) {
        int n=nums.length;

        if(n==1) return nums[0];
        
        int dp1[]=new int[n+1];
        Arrays.fill(dp1,-1);
        int case1=helper(nums,dp1,0,n-2);

        int dp2[]=new int[n+1];
        Arrays.fill(dp2,-1);
        int case2=helper(nums,dp2,1,n-1);

        return Math.max(case1,case2);
    }

    static int helper(int nums[],int dp[],int i,int n){
        if(i>n) return 0;

        if(dp[i]!=-1) return dp[i];

        int pick=nums[i]+helper(nums,dp,i+2,n);
        int notPick=helper(nums,dp,i+1,n);
        return dp[i]=Math.max(pick,notPick);
    }
}