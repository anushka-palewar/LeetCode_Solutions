class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]%2;
        }

        int[] prefixCount = new int[nums.length + 1];
        prefixCount[0] = 1;
        int sum = 0;
        int ans = 0;
        
        for (int num : nums) {
            sum += num;
            if (sum >= k) {
                ans += prefixCount[sum - k];
            }
            prefixCount[sum]++;
        }
        
        return ans;

    }
}