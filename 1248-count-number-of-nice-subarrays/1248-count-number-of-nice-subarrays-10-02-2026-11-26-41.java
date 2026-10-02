class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);

        int prefix=0,count=0;
        for(int i=0;i<nums.length;i++){
            prefix+=nums[i]%2;

            if(mp.containsKey(prefix-k)){
                count+=mp.get(prefix-k);
            }
            mp.put(prefix,mp.getOrDefault(prefix,0)+1);
        }
        return count;
    }
}