class Solution {
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        int[][] dp = new int[n][n];
        for (int i = 0;i < n;i++) {
            Arrays.fill(dp[i], -1);
        }
        return lps(0,n-1,s,dp);
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

    //      //i-> m-1 to 0  j-> n-1 to 0
    //     int dp[][]=new int[m][n];
    //     for(int i=0;i<m;i++){
    //         for(int j=0;j<n;j++){
    //             dp[i][j]=-1;
    //         }
    //     }

    //     return lcs(m-1,n-1,a,b,dp);
    // }

    // public static int lcs(int i,int j,StringBuilder a,StringBuilder b,int dp[][]){
    //     if(i<0 || j<0 ) return 0;
    //     if(dp[i][j]!=-1) return dp[i][j];

    //     if(a.charAt(i)==b.charAt(j)){
    //         return dp[i][j]= 1+lcs(i-1,j-1,a,b,dp);
    //     }else{
    //         return dp[i][j]= Math.max(lcs(i-1,j,a,b,dp),lcs(i,j-1,a,b,dp));
    //     }
    // }