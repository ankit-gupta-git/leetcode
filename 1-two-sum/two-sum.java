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

        for(int i = 0; i < nums.length; i++) {
            int lookingFor = target - nums[i];

            if(map.containsKey(lookingFor)) {
                return new int[] {
                    i, 
                    map.get(lookingFor)
                };
            }
            map.put(nums[i], i);
        }
        return new int[] { }; 
    }
}