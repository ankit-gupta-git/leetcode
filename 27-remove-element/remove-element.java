class Solution {
    public int removeElement(int[] nums, int val) {
         int j = 0;
         for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
         }
         return j;
    }

    public int removeElementBetter(int[] nums, int val) {
        int i = 0;
        int j = nums.length; // 1234
        while (i < j) {
            if(nums[i] == val) {
                nums[i] = nums[j - 1];
                j--;
            } else {
                i++;
            }
        }
        return i;
    }
}