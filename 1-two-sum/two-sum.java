class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Brute force approach
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++){
        //         // if(i == j) continue;
        //         if(nums[i] + nums[j] == target){            //O(n2)
        //             return new int[] {i,j};
        //         }
        //     }
        // }

        //via HashMap
        HashMap<Integer, Integer> map = new HashMap();

        //fill HM
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        //Searching
        for(int i = 0; i < nums.length; i++) { //2, 7, 11, 15 target = 9
            int num = nums[i]; //2
            int rem = target - num; //7
            if(map.containsKey(rem)) {
                int index = map.get(rem);
                if(index == i) continue;
                return new int[] {i, index};
            }
        }
        return new int[] {}; 
    }
}