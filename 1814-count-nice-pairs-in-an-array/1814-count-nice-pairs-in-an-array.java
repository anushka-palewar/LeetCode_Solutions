class Solution {
    public int countNicePairs(int[] nums) {
        //nums[i] + rev(nums[j]) == nums[j] + rev(nums[i])
        //nums[i] - rev(nums[i]) == nums[j] - rev(nums[j])
        int mod=1000000007;
        Map<Integer,Integer> mp=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            int diff=nums[i]-reverse(nums[i]);
            if(mp.containsKey(diff)){
                count=(count+mp.get(diff))%mod;
            }
            mp.put(diff,mp.getOrDefault(diff,0)+1);
        }
        return count;
    }

    static int reverse(int num){
        int rev=0;
        while(num>0){
            rev=rev*10+num%10;
            num/=10;
        }
        return rev;
    }
}