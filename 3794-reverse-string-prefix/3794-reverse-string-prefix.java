class Solution {
    public String reversePrefix(String s, int k) {
        String firstPart = new StringBuilder(s.substring(0, k)).reverse().toString();
        String secondPart = s.substring(k);
        return firstPart + secondPart;
    }
}