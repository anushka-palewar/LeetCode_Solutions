class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;

        long[] prefix = new long[n];
        long[] suffix = new long[n];

        int i=0, j=n-1;
        long startSum =0,endSum=0;

        while(i<n && j>=0) {
            startSum +=nums[i];
            endSum +=nums[j];

            prefix[i] = startSum;
            suffix[j] = endSum;

            i++;
            j--;
        }

        int count=0;
        for (int k=0;k<n-1;k++) {
            if (prefix[k]>=suffix[k+1]) {
                count++;
            }
        }

        return count;
    }
}
