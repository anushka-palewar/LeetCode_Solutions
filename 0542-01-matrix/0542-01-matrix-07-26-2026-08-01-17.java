class Solution {
    public int[][] updateMatrix(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dist = new int[m][n];

        Queue<int[]> q=new LinkedList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    dist[i][j]=0;
                    q.offer(new int[]{i,j});
                }
                else {
                    dist[i][j]=-1;
                }
            }
        }

        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};

        while(!q.isEmpty()){
            int curr[]=q.poll();
            int r=curr[0],c=curr[1];

            for(int i=0;i<4;i++){
                int nr = r + dr[i];
                int nc = c + dc[i];

                if(nr>=0 && nc>=0 &&
                   nr<m && nc<n &&
                   dist[nr][nc] == -1){

                    dist[nr][nc] = dist[r][c] + 1;

                    q.offer(new int[]{nr, nc});
                }
            }
        }
        return dist;
    }
}