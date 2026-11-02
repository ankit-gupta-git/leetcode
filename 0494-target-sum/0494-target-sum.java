class Solution {
    public int findTargetSumWays(int[] arr, int target) {
        int totalSum = 0;

        for (int num : arr) {
            totalSum += num;
        }

        if (Math.abs(target) > totalSum) return 0;

        if ((totalSum + target) % 2 != 0) return 0;

        int sum = (totalSum + target) / 2;

        int[][] dp = new int[arr.length + 1][sum + 1];

        dp[0][0] = 1;

        for (int i = 1; i <= arr.length; i++) {
            for (int j = 0; j <= sum; j++) {

                dp[i][j] = dp[i - 1][j];

                if (arr[i - 1] <= j) {
                    dp[i][j] += dp[i - 1][j - arr[i - 1]];
                }
            }
        }

        return dp[arr.length][sum];
    }
}