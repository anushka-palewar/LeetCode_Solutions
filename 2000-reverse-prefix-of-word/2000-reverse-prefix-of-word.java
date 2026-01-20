class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        int i=0;
        boolean found = false;

        for(char c: word.toCharArray()){
            stack.push(c);
            i++;
            if(c==ch){
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                found=true;
                break;    
            }
        }

        if (!found) return word;
        
        for(int j=i;j<word.length();j++){
            sb.append(word.charAt(j));
        }
        return sb.toString();
    }
}