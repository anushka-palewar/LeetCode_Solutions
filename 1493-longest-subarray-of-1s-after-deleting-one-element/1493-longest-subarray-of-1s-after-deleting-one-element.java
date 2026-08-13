class Solution {
    public int longestSubarray(int[] nums) {
        int zeroes=0,i=0,maxLen=0;

        for(int j=0;j<nums.length;j++){
            if(nums[j]==0) zeroes++;
            while(zeroes>1){
                if(nums[i]==0){
                    zeroes--;
                }
                i++;
            }
            maxLen=Math.max(maxLen,j-i);
        }
        return maxLen;
    }
}