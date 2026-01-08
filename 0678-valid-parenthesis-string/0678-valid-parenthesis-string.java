class Solution {
    public boolean checkValidString(String s) {
        int leftMin = 0, leftMax = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                leftMin++;
                leftMax++;
            } else if (c == ')') {
                leftMin--;
                leftMax--;
            } else { // '*'
                leftMin--;   // treat as ')'
                leftMax++;   // treat as '('
            }

            // Too many closing brackets
            if (leftMax < 0) return false;

            // leftMin cannot be negative
            if (leftMin < 0) leftMin = 0;
        }

        // All '(' must be matched
        return leftMin == 0;
    }
}
