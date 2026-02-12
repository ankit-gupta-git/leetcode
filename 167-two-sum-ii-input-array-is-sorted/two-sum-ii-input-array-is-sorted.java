class Solution {
    public int[] twoSum(int[] arr, int target) {
        // //Two pointer approach

        // int i =0 ;
        // int j  = arr.length - 1;

        // while(i < j) {
        //     if(arr[i] + arr[j] < target) {
        //         i++;
        //     } else if (arr[i] + arr[j] > target) {
        //         j--;
        //     } else {
        //         return new int[] {i + 1, j + 1};
        //     }
        // }
        // return null;

        for(int i = 0; i <= arr.length - 1; i++) {
            for(int j = i+1; j < arr.length; j++){ 
                if(arr[i] + arr[j] == target) {
                    return new int[] {i+1, j+1};
                }
            }
        }
        return null;
    }
}