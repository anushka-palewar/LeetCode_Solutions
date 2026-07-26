class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean visited[]=new boolean[n];

        bfs(0,rooms,visited);
        for(boolean res:visited){
            if(res==false) return false;
        }
        return true;
    }

    static void bfs(int start,List<List<Integer>> rooms,boolean[] visited){
        Queue<Integer> q=new LinkedList<>();
        q.offer(start);
        visited[start]=true;

        while(!q.isEmpty()){
            int node=q.poll();
            for(int ele:rooms.get(node)){
                if(!visited[ele]){
                    q.offer(ele);
                    visited[ele]=true;
                }
            }
        }
    }
}