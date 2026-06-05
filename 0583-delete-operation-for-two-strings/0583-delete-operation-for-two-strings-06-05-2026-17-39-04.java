class Solution {
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        return m+n-2*lcs(word1,word2);
    }
    public int lcs(String t1, String t2) {
        int m=t1.length();
        int n=t2.length();
        
        int dp[][]=new int[m+1][n+1];
    
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(t1.charAt(i)==t2.charAt(j)){
                    dp[i+1][j+1]=1+dp[i][j];
                }else{
                    dp[i+1][j+1]=Math.max(dp[i][j+1],dp[i+1][j]);
                }
            }
        }
        return dp[m][n];
    }
}