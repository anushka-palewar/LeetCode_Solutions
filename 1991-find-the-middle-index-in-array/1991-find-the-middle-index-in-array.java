class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int i=0,j=n-1;
        int prefix[]=new int[n];
        int suffix[]=new int[n];

        int startSum=0,endSum=0;
        while(i<n && j>=0){
            startSum+=nums[i];
            endSum+=nums[j];

            prefix[i]=startSum;
            suffix[j]=endSum;

            i++;
            j--;
        }

        for(int k=0;k<n;k++){
            if(prefix[k]==suffix[k]){
                return k;
            }
        }

        return -1;
    }
}