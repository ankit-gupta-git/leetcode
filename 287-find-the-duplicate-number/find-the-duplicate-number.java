class Solution {
    public int findDuplicate(int[] arr) {
        // Set<Integer> s = new HashSet<>();

        // for(int val : nums) {
        //     if(s.contains(val)) {
        //         return val;
        //     }
        //     s.add(val);
        // }

        // return -1;


        //By Slow fast pointer 
        int slow = arr[0], fast = arr[0];

        do {
            slow = arr[slow]; //+1
            fast = arr[arr[fast]]; //+2
        } while(slow != fast);

        slow = arr[0];

        while(slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }

        return slow;

    }
};