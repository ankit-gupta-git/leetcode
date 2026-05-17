class Solution {
    public void duplicateZeros(int[] arr) {

        int n = arr.length;

        int[] dest = new int[n];

        int j = 0;

        // Fill destination array
        for(int i = 0; i < n && j < n; i++) {

            dest[j] = arr[i];
            j++;

            // Duplicate zero
            if(arr[i] == 0 && j < n) {
                dest[j] = 0;
                j++;
            }
        }

        // Copy back to original array
        for(int i = 0; i < n; i++) {
            arr[i] = dest[i];
        }
    }
}