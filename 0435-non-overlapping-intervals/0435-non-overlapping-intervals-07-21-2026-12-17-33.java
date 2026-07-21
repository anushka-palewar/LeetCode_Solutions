class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n=intervals.length;
        Set<Integer> set=new HashSet<>();

        Arrays.sort(intervals, (a,b)->a[1]-b[1]);
        
        int lastEnd=intervals[0][1],count=0;
        set.add(intervals[0][0]);

        for(int i=1;i<n;i++){
            if (intervals[i][0] >= lastEnd) {
                // Keep this interval
                lastEnd = intervals[i][1];
            } else {
                // Remove current interval
                count++;
            }

        }
        return count;
    }
}