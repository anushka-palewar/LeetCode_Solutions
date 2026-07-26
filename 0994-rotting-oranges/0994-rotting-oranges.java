class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int fresh=0;
        Queue<int[]> q=new LinkedList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
                else if(grid[i][j]==1) fresh++;
            }
        }
        if(fresh==0) return 0;
        int minutes=0;

        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};

        while(!q.isEmpty()){
            int size=q.size();
            boolean rottenThisMinute=false;
            while(size-->0){
                int[] curr=q.poll();
                int r=curr[0];
                int c=curr[1];
                for(int i=0;i<4;i++){
                    int nr=r+dr[i];
                    int nc=c+dc[i];

                    if(nr>=0 && nc>=0 &&
                       nr<m && nc<n &&
                       grid[nr][nc]==1){

                        grid[nr][nc]=2;
                        fresh--;
                        q.offer(new int[]{nr,nc});
                        rottenThisMinute = true;
                    }
                }
            }
            if(rottenThisMinute) minutes++;
        }
        return fresh == 0 ? minutes : -1;
    }
}