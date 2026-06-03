class Solution {
    public String longestPalindrome(String s) {
        int n=s.length(),count=0;
        int dp[][]=new int[n][n];

        int start=0,maxLen=1;

        for(int k=0;k<n;k++){ // outer loop n times loop chlega
            int i=0,j=k; // loop hmesha (0,0),(0,1),(0,2).... se start honga
            while(j<n){
                if(i==j){  //len=1
                    dp[i][j]=1; 
                }    
                else if(j==i+1){ //len=2
                    if(s.charAt(i)==s.charAt(j)) {
                        dp[i][j]=1;

                        if(2>maxLen){
                            maxLen=2;   //stroring start and end of a string
                            start=i;
                        } 
                    }
                }else{ //len>2
                    if (s.charAt(i) == s.charAt(j) &&
                        dp[i + 1][j - 1] == 1) {

                        dp[i][j] = 1;

                        int len = j - i + 1;

                        if (len > maxLen) {
                            maxLen = len;
                            start = i;
                        }
                    }
                }

                i++;
                j++;
            }
        }

        return s.substring(start,start+maxLen);
    }
    
}