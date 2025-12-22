class Solution {

            boolean canEatAll(int[] piles, int mid, int h) {
            int actualHrs = 0;

            for(int x : piles) {
                actualHrs += x/mid; //hrs

                if(x%mid != 0) {
                    actualHrs++;
                }
            }
            return actualHrs <= h;
        }

    public int minEatingSpeed(int[] piles, int h) {

        int n = piles.length;

        int l = 1;
        int r = 1;
        for (int x : piles) {
            r = Math.max(r, x);
        }


        while(l < r) {

            int mid = l + (r - l) / 2; //per hr i can eat mid no. of bananas

            if(canEatAll(piles, mid, h)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}