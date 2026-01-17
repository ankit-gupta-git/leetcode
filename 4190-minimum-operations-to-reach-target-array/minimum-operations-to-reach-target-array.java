class Solution {
    public int minOperations(int[] nums, int[] target) {
        int[] virelantos = nums;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != target[i]) {
                set.add(nums[i]);
            }
        }
        return set.size();
    }
}