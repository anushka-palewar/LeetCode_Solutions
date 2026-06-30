class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();

        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }

        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]); //min heap

        for(int key:mp.keySet()){
            if(pq.size()< k) pq.offer(new int[]{key,mp.get(key)});
            else{
                if(mp.get(key)>pq.peek()[1]){ //compare freq
                    pq.poll();
                    pq.offer(new int[]{key,mp.get(key)});
                }
            }
        }

        int ans[]=new int[k];
        for(int i=k-1;i>=0;i--){
            ans[i]=pq.poll()[0]; //store key
        }

        return ans;
    }
}