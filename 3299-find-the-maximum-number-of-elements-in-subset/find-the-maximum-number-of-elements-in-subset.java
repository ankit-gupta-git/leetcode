import java.util.*;

class Solution {
    public int maximumLength(int[] nums) {

        HashMap<Long, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put((long) num, map.getOrDefault((long) num, 0) + 1);
        }

        int ans = 1;

        // Handle 1 separately
        if (map.containsKey(1L)) {
            int ones = map.get(1L);
            ans = (ones % 2 == 0) ? ones - 1 : ones;
        }

        for (long num : map.keySet()) {

            if (num == 1) continue;

            long curr = num;
            int len = 0;

            while (true) {

                Integer freq = map.get(curr);

                if (freq == null)
                    break;

                if (freq >= 2) {
                    len += 2;
                } else {
                    len++;
                    break;
                }

                // Prevent overflow before squaring
                if (curr > 1000000000L)
                    break;

                curr *= curr;
            }

            if (len % 2 == 0)
                len--;

            ans = Math.max(ans, len);
        }

        return ans;
    }
}