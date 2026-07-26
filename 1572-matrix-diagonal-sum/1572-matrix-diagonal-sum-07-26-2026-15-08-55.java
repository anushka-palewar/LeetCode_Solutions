class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int left = 0, right = 0;

        for (int i = 0; i < n; i++) {
            left += mat[i][i];
            right += mat[i][n - 1 - i];
        }

        int ans = left + right;

        if (n % 2 == 1) {
            ans -= mat[n / 2][n / 2];
        }

        return ans;

    }
}