class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;

        int dp[]=new int[n];
        int parent[]=new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(parent, -1);
        int maxi=0;

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0 && dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                    parent[i]=j;
                }
                if(dp[i]>dp[maxi]) maxi=i;
            }
        }

        List<Integer> ls=new ArrayList<>();
        for(int i=maxi;i>=0;i=parent[i]){
            ls.add(nums[i]);
        }

        return ls;
    }
}