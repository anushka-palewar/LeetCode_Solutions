class Solution {
    public int countSubstrings(String s) {
        int n=s.length(),count=0;
        int dp[][]=new int[n][n];

        for(int k=0;k<n;k++){ // outer loop n times loop chlega
            int i=0,j=k; // loop hmesha (0,0),(0,1),(0,2).... se start honga
            while(j<n){
                if(i==j){  //len=1
                    dp[i][j]=1; count++;
                }    
                else if(j==i+1){ //len=2
                    if(s.charAt(i)==s.charAt(j)) {
                        dp[i][j]=1; count++;
                    }
                }else{ //len>2
                    if(s.charAt(i)==s.charAt(j)){
                        if(dp[i+1][j-1]==1){
                            dp[i][j]=1; count++;
                        }
                    }
                }

                i++;
                j++;
            }
        }
        return count;
    }
}