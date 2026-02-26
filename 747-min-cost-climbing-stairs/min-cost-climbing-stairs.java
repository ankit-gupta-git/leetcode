import java.util.Arrays;

class Solution {
    int[] t;

    int solve(int idx, int[] cost) {
        if (idx >= cost.length) {
            return 0;
        }

        if (t[idx] != -1) {
            return t[idx];
        }

        int oneStep = cost[idx] + solve(idx + 1, cost);
        int twoStep = cost[idx] + solve(idx + 2, cost);

        return t[idx] = Math.min(oneStep, twoStep);
    }

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        t = new int[n];
        Arrays.fill(t, -1);

        return Math.min(solve(0, cost), solve(1, cost));
    }
}