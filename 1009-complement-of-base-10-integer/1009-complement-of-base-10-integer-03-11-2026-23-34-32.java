class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        int val=n;
        for(int i=0;i<=4;i++){
            val|=val>>(1<<i);
        }

        return ~n & val;
    }
}