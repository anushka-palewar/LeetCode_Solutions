class Solution {
    public int jump(int[] nums) {
        int farest=0,end=0,jump=0;
        for(int i=0;i<nums.length-1;i++){
            farest=Math.max(farest,i+nums[i]);

            if(i==end){
                jump++;
                end=farest;
            }
        }
        return jump;
    }
}