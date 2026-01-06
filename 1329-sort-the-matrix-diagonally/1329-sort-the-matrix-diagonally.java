class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        Map<Integer, PriorityQueue<Integer>> mp = new HashMap<>();

        // Step 1: Collect elements of each diagonal
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mp.putIfAbsent(i - j, new PriorityQueue<>());
                mp.get(i - j).offer(mat[i][j]);
            }
        }

        // Step 2: Put sorted elements back into matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = mp.get(i - j).poll();
            }
        }

        return mat;
    }
}