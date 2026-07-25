class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces = 0;

        for(int i = 0; i < n; i++){
            if(!visited[i]){
                dfs(i, isConnected, visited);
                provinces++;
            }
        }
        return provinces;
    }
    static void dfs(int city,int[][] isConnected,boolean[] visited){
        visited[city]=true;
        for(int i=0;i<isConnected.length;i++){
            if(isConnected[city][i]==1 && !visited[i]){
                bfs(i,isConnected,visited);
            }
        }
    }

    static void bfs(int city,int[][] isConnected,boolean[] visited){
        Queue<Integer> q=new LinkedList<>();
        q.offer(city);
        visited[city]=true;

        while(!q.isEmpty()){
            int curr=q.poll();
            for (int neighbour = 0; neighbour < isConnected.length; neighbour++) {
                if (isConnected[curr][neighbour] == 1 &&
                    !visited[neighbour]) {
                    visited[neighbour] = true;
                    q.offer(neighbour);
                }
            }
        }
    }
}