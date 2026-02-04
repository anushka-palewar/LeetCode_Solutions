class Solution {
    public boolean judgeSquareSum(int c) {
        long i = 0;                       
        long j = (long) Math.sqrt(c); 
        while(i<=j){
            long res=i*i+j*j;
            if(res==c) return true;
            else if(res<c) i++;
            else j--;
        }
        return false;
    }
}