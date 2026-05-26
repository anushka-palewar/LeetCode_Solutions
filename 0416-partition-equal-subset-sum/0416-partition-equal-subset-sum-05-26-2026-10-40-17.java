class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum%2!=0) return false;

        int target=sum/2;
        int n=nums.length;
        int dp[][]=new int[n][target+1];
        for(int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(nums,dp,target,0);
    }
    public static boolean helper(int nums[],int dp[][],int t,int i){
        if(t==0) return true;
        if(i==nums.length) return false;
            
        if(dp[i][t]!=-1) return dp[i][t]==1;

        boolean notPick=helper(nums,dp,t,i+1);
        boolean pick=false;
        
        if(nums[i] <= t) {
            pick = helper(nums, dp, t - nums[i], i + 1);
        }

        boolean ans=pick || notPick;
        dp[i][t] = ans ? 1 : 0; //agar ans true hai too 1 else 0 store in dp array
        return ans;
    }
}