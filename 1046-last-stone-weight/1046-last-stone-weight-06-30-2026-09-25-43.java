class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int num:stones){
            pq.offer(num);
        }

        while(pq.size()>1){
            int f=pq.poll();
            int s=pq.poll();

            if(f!=s) pq.offer(f-s);
        }

        return pq.isEmpty()?0:pq.peek();
    }
}