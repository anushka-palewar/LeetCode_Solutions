class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        for(String s:operations){
            if(s.equals("C")){
                stack.pop();
            }else if(s.equals("D")){
                int res=stack.peek()*2;
                stack.push(res);
            }else if(s.equals("+")){
                int first = stack.pop();
                int second = stack.peek();
                stack.push(first);
                stack.push(first + second);

            }else{
                stack.push(Integer.parseInt(s));
            }
        }

        int sum=0;
        while(!stack.isEmpty()) sum+=stack.pop();
        return sum;
    }
}