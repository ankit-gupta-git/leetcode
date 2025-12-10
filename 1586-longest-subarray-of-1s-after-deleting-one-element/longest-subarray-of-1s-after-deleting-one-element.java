class Solution {


//Brute Force O(n2)
// int n;

//    int findMax(int[] nums, int skip_idx) {
//         int currLength = 0;
//         int maxLength = 0;

//         for(int i = 0; i < n; i++) {
//             if(i == skip_idx)
//             continue;

//             if(nums[i] == 1) {
//                 currLength++;
//                 maxLength = Math.max(maxLength, currLength);
//             } else {
//                 currLength = 0;
//             }
//         }
//              return maxLength;
//     }


    public int longestSubarray(int[] nums) {
        int n = nums.length;

        int maxLength = 0;
        int zeroCount = 0;

        int i = 0;

        for(int j = 0; j < n; j++) {
            if(nums[j] == 0) 
                zeroCount++;

                while(zeroCount > 1) {

                    if (nums[i] == 0)
                        zeroCount--;
                        i++;
                    }
                    maxLength = Math.max(maxLength, j-i);
                }
        return maxLength;
    }


        // for(int i = 0; i < n; i++) {
        //     if(nums[i] == 0) {
        //         countZero++;
        //         result = Math.max(result, findMax(nums, i));
        //     }
        // }

        // if(countZero == 0){
        //     return n - 1;
        // }
        // return result;
//     }
}