class Solution {
    public int missingNumber(int[] nums) {
        // Set<Integer> set = new HashSet<>();

        // for(int num : nums) {
        //     set.add(num);
        // }

        // for(int num = 0; num <= nums.length; num++) {
        //     if(!set.contains(num)) {
        //         return num;
        //     }
        // }

        // return -1;


        int i = 0;

        while(i < nums.length) {
            int corrIdx = nums[i];

            if (corrIdx >= nums.length) {
                i++;
            } else if(nums[corrIdx] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[corrIdx];
                nums[corrIdx] = temp;
            } else {
                i++;
            }
        }

        for(int num = 0; num < nums.length; num++) {
            if(num!= nums[num]) {
                return num;
            }
        }

        return nums.length;
    }
}