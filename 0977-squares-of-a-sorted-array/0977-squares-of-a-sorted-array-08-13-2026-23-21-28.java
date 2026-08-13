class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0,j=nums.length-1,l=nums.length-1;
        int res[]=new int[nums.length];

        while(i<=j){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                res[l]=nums[i]*nums[i];
                l--;
                i++;
            }else{
                res[l]=nums[j]*nums[j];
                l--;
                j--;
            }
        }
        return res;
    }
}