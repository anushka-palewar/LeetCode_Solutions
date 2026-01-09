class MyStack {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    public MyStack() {
        queue1= new ArrayDeque<>();
        queue2= new ArrayDeque<>();
    }
    
    public void push(int x) {
        queue1.offer(x);

        // Step 2: move all elements from q1 to q2
        while (!queue2.isEmpty()) {
            queue1.offer(queue2.poll());
        }

        // Step 3: swap q1 and q2
        Queue<Integer> temp = queue2;
        queue2 = queue1;
        queue1 = temp; 
    }
    
    public int pop() {
        return queue2.poll();
    }
    
    public int top() {
        return queue2.peek();
    }
    
    public boolean empty() {
        return queue2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */