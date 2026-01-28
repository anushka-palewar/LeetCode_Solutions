class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int r=matrix.length,c=matrix[0].length;

        //find prefix sum row wise
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                matrix[i][j]+=matrix[i][j-1];
            }
        }

        //find subarray
        int res=0;
        for(int sc=0;sc<c;sc++){
            for(int j=sc;j<c;j++){
                Map<Integer,Integer> mp=new HashMap<>();
                mp.put(0,1);
                int cumSum=0;
                 
                for(int row=0;row<r;row++){
                    cumSum+=matrix[row][j]-(sc>0?matrix[row][sc-1]:0);

                    if(mp.containsKey(cumSum-target)){
                        res+=mp.get(cumSum-target);
                    }

                    mp.put(cumSum,mp.getOrDefault(cumSum,0)+1);
                }
            }
        }
        return res;
    }
}