class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        // first row to last
        for(int i=0;i<n;i++){
            if(board[0][i]=='O') dfs(board,0,i);
            if(board[m-1][i]=='O') dfs(board,m-1,i);
        }

        //first column-last
        for(int j=0;j<m;j++){
            if(board[j][0]=='O') dfs(board,j,0);
            if(board[j][n-1]=='O') dfs(board,j,n-1);
        }

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O') board[i][j]='X';
                if(board[i][j]=='#') board[i][j]='O';
            }
        }
    }
    static void dfs(char board[][],int i,int j){
        if(i<0 || j<0 || i>=board.length || j>=board[0].length) return;
        
        if(board[i][j]!='O')
            return;

        board[i][j]='#';

        dfs(board,i,j+1);
        dfs(board,i,j-1);
        dfs(board,i-1,j);
        dfs(board,i+1,j);
    }
}