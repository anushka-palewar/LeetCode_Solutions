class Solution {
    public int singleNonDuplicate(int[] nums) {
        int s=0,e=nums.length-1;
        int n=nums.length;

        while(s<=e){
            if(n==1) return nums[0];
            if(nums[0]!=nums[1]) return nums[0];
            if(nums[n-1]!=nums[n-2]) return nums[n-1];

            int mid=s+(e-s)/2;

            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) return nums[mid];

            //if we are in left
            if((mid%2==1 && nums[mid]==nums[mid-1]) || (mid%2==0 && nums[mid]==nums[mid+1])){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return -1;
    }
}