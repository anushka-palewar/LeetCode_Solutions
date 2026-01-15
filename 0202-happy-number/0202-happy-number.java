class Solution {
    public boolean isHappy(int n) {
        return isHappyHelper(n, new HashSet<>());
    }

    private boolean isHappyHelper(int n, HashSet<Integer> seen) {
        if (n == 1) return true;
        if (seen.contains(n)) return false;

        seen.add(n);
        int next = getNext(n);
        return isHappyHelper(next, seen);
    }

    private int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}