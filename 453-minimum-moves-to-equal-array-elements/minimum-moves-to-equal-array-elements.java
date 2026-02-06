class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];
        int result = 0;

        // Step 1: find minimum
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        // Step 2: calculate moves
        for (int i = 0; i < nums.length; i++) {
            result += nums[i] - min;
        }

        return result;
    }
}
