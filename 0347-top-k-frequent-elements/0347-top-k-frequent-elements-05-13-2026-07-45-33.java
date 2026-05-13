class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Integer> pq=new PriorityQueue<>(
            (a,b)-> mp.get(b)-mp.get(a)
        );
        pq.addAll(mp.keySet());

        int res[]=new int[k];
        for(int i=0;i<k;i++){
            res[i]=pq.poll();
        }

        return res;
    }
}