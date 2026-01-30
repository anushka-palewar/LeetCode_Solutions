class Solution {

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (puzzle(board, i, j, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean puzzle(char[][] board, int i, int j, String word) {

        if (word.length() == 0) return true;

        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length
                || board[i][j] != word.charAt(0)) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '#';

        String remaining = word.substring(1);

        boolean found =
                puzzle(board,i + 1, j, remaining) ||
                puzzle(board,i - 1, j, remaining) ||
                puzzle(board,i, j + 1, remaining) ||
                puzzle(board,i, j - 1, remaining);

        board[i][j] =temp;

        return found;
    }
}