class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }

        for(int num = 0; num <= nums.length; num++) {
            if(!set.contains(num)) {
                return num;
            }
        }

        return -1;
    }
}