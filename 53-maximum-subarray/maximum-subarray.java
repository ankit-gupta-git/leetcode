class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        // for(int st = 0; st < n; st++) {
        //     int currSum = 0;
        //     for(int end = st; end < n; end++){          //O(n2)
        //         currSum += nums[end];
        //         maxSum = Math.max(maxSum, currSum);
        //     }
        // }

        for(int i = 0; i < n; i++){
            currSum += nums[i];
            maxSum = Math.max(currSum, maxSum);

            if(currSum < 0) {
                currSum = 0;
            }
        }
            return maxSum;
    }
}