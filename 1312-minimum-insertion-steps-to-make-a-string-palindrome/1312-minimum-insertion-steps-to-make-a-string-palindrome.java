class Solution {
    public int minInsertions(String s) {
        int n=s.length();
        int[][] dp = new int[n][n];
        for (int i = 0;i < n;i++) {
            Arrays.fill(dp[i], -1);
        }
        return n-lps(0,n-1,s,dp);
    }

    public static int lps(int i,int j,String s,int dp[][]){
        if(i>j) return 0;
        if (i == j) return 1;

        if(dp[i][j]!=-1) return dp[i][j];

        if(s.charAt(i)==s.charAt(j)){
            return dp[i][j]= 2+lps(i+1,j-1,s,dp);
        }else{
            return dp[i][j]= Math.max(lps(i+1,j,s,dp),lps(i,j-1,s,dp));
        }
    }
}