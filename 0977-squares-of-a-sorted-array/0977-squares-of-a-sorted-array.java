class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=square(nums[i]);
        }
        Arrays.sort(arr); 
        return arr;
    }

    static int square(int x){
        return x*x;
    }
}