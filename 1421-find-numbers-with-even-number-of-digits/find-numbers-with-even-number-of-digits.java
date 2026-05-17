class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        // for(int i = 0; i < nums.length; i++) {
        //     int count = 0;

        //     int dig = nums[i];

        //     while(dig > 0) {
        //         count++;
        //         dig = dig / 10;
        //     }

        //     if(count % 2 == 0) {
        //         ans++;
        //     }
        // }


        for(int num : nums) {
            int len = String.valueOf(num).length();

            if(len % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }
}