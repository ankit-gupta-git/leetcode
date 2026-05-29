class Solution {
    int digitSum(int num) {
        int Sum  = 0;
        while(num > 0) {
            Sum += num % 10;
            num /= 10;
        }
        return Sum;
    }

    public int minElement(int[] nums) {
        int ans = Integer.MAX_VALUE;

        for(int num : nums) {
            int Sum = digitSum(num);
            ans = Math.min(ans, Sum);
        }
        return ans;
        
    }
}