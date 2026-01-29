class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> set=new HashSet<>();
        int missing=-1;
        int repeated=-1;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(set.contains(grid[i][j])) repeated=grid[i][j];

                set.add(grid[i][j]);
            }
        }

        int n=grid.length;
        for(int i=1;i<n*n;i++){
            if(!set.contains(i)){
                missing=i;
                break;
            }
        }

        if(missing==-1) missing=n*n;

        return new int[]{repeated,missing};
    }
}