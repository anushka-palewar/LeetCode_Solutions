class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        int sum=0,maxLen=0;
        
        for(int i=0;i<nums.length;i++){
            sum+= nums[i]==0?-1:1;

            if(sum==0){
                maxLen=i+1;
            }else if(mp.containsKey(sum)){
                maxLen=Math.max(maxLen,i-mp.get(sum));
            }else{
                mp.put(sum,i);
            }
        }
        return maxLen;
    }
}