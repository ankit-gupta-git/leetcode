class Solution {

    private int firstOccurrence(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;
                high = mid - 1; // Search left
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    private int lastOccurrence(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;
                low = mid + 1; // Search right
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public int[] searchRange(int[] nums, int target) {

        int first = firstOccurrence(nums, target);
        int last = lastOccurrence(nums, target);

        return new int[]{first, last};
    }
}
    
    

        // int st = 0, mid= 0, end = nums.length -1;
        // int[] idx = {-1, -1}; 

        // while (st <= end) {
        //     mid = st  + (end - st) / 2;

        //     if(nums[mid] == target) {
        //         idx[0] = mid;
        //         end = mid - 1;
        //     } else if (nums[mid] > target) {
        //         end = mid - 1;    
        //     } else if (nums[mid] < target) {
        //         st = mid + 1;
        //     }
        // }

        // st = 0;
        // end = nums.length -1;
        // mid = 0;


        // while (st <= end) {
        //     mid = st  + (end - st) / 2;

        //     if(nums[mid] == target) {
        //         idx[1] = mid;
        //         st = mid + 1;
        //     } else if (nums[mid] > target) {
        //         end = mid - 1;    
        //     } else if (nums[mid] < target) {
        //         st = mid + 1;
        //     }
        // }
        // return idx;
//         }
// }