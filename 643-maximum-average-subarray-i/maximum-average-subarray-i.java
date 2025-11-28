class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        int st = 0, end = k;
        while (end < nums.length) {
            sum -= nums [st];
            st++;

            sum += nums[end];
            end++;

            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum / k;
        }
}