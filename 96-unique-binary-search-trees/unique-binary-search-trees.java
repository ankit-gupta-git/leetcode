class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];

        // base cases
        dp[0] = 1;
        dp[1] = 1;

        for (int nodes = 2; nodes <= n; nodes++) {
            int total = 0;

            for (int root = 1; root <= nodes; root++) {
                int left = dp[root - 1];
                int right = dp[nodes - root];

                total += left * right;
            }

            dp[nodes] = total;
        }

        return dp[n];
    }
}