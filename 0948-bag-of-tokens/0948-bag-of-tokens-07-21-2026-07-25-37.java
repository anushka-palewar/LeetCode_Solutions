class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);

        int i=0,score=0,j=tokens.length-1,maxScore=0;
        while(i<=j){
            if(power>=tokens[i]){
                power-=tokens[i++];
                score++;
                maxScore=Math.max(maxScore,score);
            }else if(score>0){
                power+=tokens[j--];
                score--;
            }else{
                break;
            }
        }
        return maxScore;
    }
}