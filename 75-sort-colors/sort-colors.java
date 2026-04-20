class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length - 1;
        int count = 0, count1 = 0, count2 = 0;

        //O(n)
        for (int i = 0 ; i <= n; i++){
            if(nums[i] == 0) count++;
            else if (nums[i] == 1) count1++;
            else count2++;
        } 

        int idx = 0;

        for(int i = 0; i < count; i++){
            nums[idx++] = 0;
        }

           for(int i = 0; i < count1; i++){
            nums[idx++] = 1;
        }

           for(int i = 0; i < count2; i++){
            nums[idx++] = 2;
        }

    //     int n = nums.length;
    //     int mid = 0, high = n-1, low = 0;

    //     while (mid <= high) {
    //         if(nums[mid] == 0){
    //             swap(nums, low, mid);
    //             mid++; low++;
            
    //         } else if (nums[mid] == 1) {
    //             mid++;

    //         } else { //2
    //             swap(nums, mid, high);
    //             high--;

    //         }
    //     }
    // }

    //     private void swap(int[] nums, int i, int j) {
    //     int temp = nums[i];
    //     nums[i] = nums[j];
    //     nums[j] = temp;


    //  Arrays.sort(nums); //Onlogn
    }
}