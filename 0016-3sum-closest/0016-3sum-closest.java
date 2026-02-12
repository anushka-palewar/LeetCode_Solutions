class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closetSum=nums[0]+nums[1]+nums[2];
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            int l=i+1;
            int r=n-1;
            while(l<r){
                int currentSum=nums[i]+nums[l]+nums[r];

                if(Math.abs(currentSum-target) < Math.abs(closetSum-target)){
                    closetSum=currentSum;
                }

                if(currentSum==target) return target;
                else if(currentSum>target) r--;
                else l++;
            }
        }
        return closetSum;
    }
}