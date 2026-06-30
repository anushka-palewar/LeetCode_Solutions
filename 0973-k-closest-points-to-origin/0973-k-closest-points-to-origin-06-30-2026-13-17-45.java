class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>(
            (a,b)-> ((b[1]*b[1]+b[0]*b[0])-     //a^2+b^2
                    (a[1]*a[1]+a[0]*a[0]))      //a^2+b^2
        ); // creates max heap

        for(int point[]:points){
            pq.offer(point);

            if(pq.size()>k) pq.poll();
        }

        int[][] ans = new int[k][2];
        for(int i=0;i<k;i++){
            ans[i]=pq.poll();
        }

        return ans;
    }
}