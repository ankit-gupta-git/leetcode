class Solution {
    public int removeDuplicates(int[] nums) {
        int low = 0;
        int res = 1;
        int high = 1;

        while(high < nums.length) {
            if(nums[high] == nums[high - 1]) {
                high++;
                continue;
            }

            nums[low + 1] = nums[high];
                low++;
                res++;
                high++;
            }
            return res;
        }
    //     int j = 0;
    //     for (int i = 0; i < nums.length; i++) {
    //         if(nums[i] != nums[j]){
    //             j++;
    //             nums[j] = nums[i];
    //         }
    //     }
    //     return j + 1;
    // }
}