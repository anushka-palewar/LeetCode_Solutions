class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack=new Stack();
        StringBuilder sb=new StringBuilder();
        for(char ch: s.toCharArray()){
            if (Character.isDigit(ch)) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}