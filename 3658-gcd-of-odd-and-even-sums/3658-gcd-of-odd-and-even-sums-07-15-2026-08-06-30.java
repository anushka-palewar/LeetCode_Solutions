class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumEven=n*(n+1);
        int sumOdd=n*n;
        return gcd(sumEven,sumOdd);
    }
    private static int gcd(int a,int b){
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
}