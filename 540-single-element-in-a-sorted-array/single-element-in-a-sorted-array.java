class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int st = 0, end = n - 1;

        while (st < end) {
            int mid = st + (end - st) / 2;
            
            // Make mid even for easier pair comparison
            if (mid % 2 == 1) mid--;

            if (nums[mid] == nums[mid + 1]) {
                st = mid + 2; // single is on the right
            } else {
                end = mid;    // single is on the left (including mid)
            }
        }

        return nums[st];
    }
}
