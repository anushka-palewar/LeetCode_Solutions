class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        int col=matrix.length-1;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(target==matrix[i][j]){
                    return true;
                }
                else if(target>matrix[i][j] && target<matrix[i][j]){
                    col--;
                }
                else{
                    row++;
                }
            }
        }
        return false;
    }
}