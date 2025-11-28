class Solution {
    public int[] searchRange(int[] nums, int target) {

        int st = 0, mid= 0, end = nums.length -1;
        int[] idx = {-1, -1}; 

        while (st <= end) {
            mid = st  + (end - st) / 2;

            if(nums[mid] == target) {
                idx[0] = mid;
                end = mid - 1;
            } else if (nums[mid] > target) {
                end = mid - 1;    
            } else if (nums[mid] < target) {
                st = mid + 1;
            }
        }

        st = 0;
        end = nums.length -1;
        mid = 0;


        while (st <= end) {
            mid = st  + (end - st) / 2;

            if(nums[mid] == target) {
                idx[1] = mid;
                st = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;    
            } else if (nums[mid] < target) {
                st = mid + 1;
            }
        }
        return idx;
        }
}