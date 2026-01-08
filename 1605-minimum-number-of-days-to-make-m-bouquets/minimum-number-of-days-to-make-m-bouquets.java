class Solution {

    public int[] findRange(int[] bloomDay){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int val : bloomDay) {
            min = Math.min(min, val);
            max = Math.max(max, val);
        }
        return new int[]{min, max};
    }

    public boolean isPossible(int day, int k, int m, int[] bloomDay){
        int total = 0;
        int count = 0;

        for(int i = 0; i < bloomDay.length; i++){
            if(bloomDay[i] <= day){
                count++;
            } else {
                count = 0;
            }

            if(count == k){
                total++;
                count = 0;
            }

            if(total >= m){
                return true;
            }
        }
        return false;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if ((long)m * k > bloomDay.length) return -1;

        int[] range = findRange(bloomDay);
        int st = range[0], end = range[1];
        int ans = -1;

        while(st <= end){
            int mid = st + (end - st) / 2;
            if(isPossible(mid, k, m, bloomDay)){
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }
}
