class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                int sum=nums1[i]+nums2[j];
                if(mp.containsKey(sum)){
                    int freq=mp.get(sum);
                    freq++;
                    mp.put(sum,freq);
                }else{
                    mp.put(sum,1);
                }
            }
        }

        int count=0;
        for(int k=0;k<nums3.length;k++){
            for(int l=0;l<nums4.length;l++){
                int sum=nums3[k]+nums4[l];
                if(mp.containsKey(-1*sum)){
                    count=count+mp.get(-1*sum);
                }
            }
        }
        return count;
    }
}