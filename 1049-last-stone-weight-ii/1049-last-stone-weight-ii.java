class Solution {

    public int lastStoneWeightII(int[] stones) {

        int sum = 0;

        for (int x : stones) {
            sum += x;
        }

        int target = sum / 2;

        int[][] dp = new int[stones.length][target + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int best = helper(stones, 0, target, dp);

        return sum - 2 * best;
    }

    static int helper(int[] stones, int i, int target, int[][] dp) {

        if (i == stones.length || target == 0) {
            return 0;
        }

        if (dp[i][target] != -1) {
            return dp[i][target];
        }

        int notPick = helper(stones, i + 1, target, dp);

        int pick = 0;

        if (stones[i] <= target) {
            pick = stones[i] +
                   helper(stones, i + 1,
                          target - stones[i], dp);
        }

        return dp[i][target] = Math.max(pick, notPick);
    }
}