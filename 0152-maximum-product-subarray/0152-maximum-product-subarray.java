class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int leftProd=1,rightProd=1;
        int maxProd=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){

            leftProd= leftProd==0?1:leftProd;
            rightProd= rightProd==0?1:rightProd;

            leftProd*=nums[i];
            rightProd*=nums[n-i-1];

            maxProd=Math.max(maxProd,Math.max(leftProd,rightProd));
        }
        return maxProd;
    }
}