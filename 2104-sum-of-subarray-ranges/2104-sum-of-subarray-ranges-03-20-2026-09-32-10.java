class Solution {
    public long subArrayRanges(int[] nums) {
        return maxSum(nums)-minSum(nums);
    }

    public long maxSum(int nums[]){
        long ans=0;
        int n=nums.length;
        Stack<Integer> st=new Stack<>();

        for(int i = 0; i <= n; i++){
            while(!st.isEmpty() && (i==n || nums[st.peek()] <= nums[i])){
                int mid=st.pop();
                int left=st.isEmpty()?-1:st.peek();
                int right=i;

                long count=(long) (mid-left)*(right-mid);
                ans+=count*nums[mid];
            }
            st.push(i);
        }
        return ans;
    }

    public long minSum(int nums[]){
        long ans=0;
        int n=nums.length;
        Stack<Integer> st=new Stack<>();

        for(int i = 0; i <= n; i++){
            while(!st.isEmpty() && (i==n || nums[st.peek()] >= nums[i])){
                int mid=st.pop();
                int left=st.isEmpty()?-1:st.peek();
                int right=i;

                long count=(long) (mid-left)*(right-mid);
                ans+=count*nums[mid];
            }
            st.push(i);
        }
        return ans;
    }
}