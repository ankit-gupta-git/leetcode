class Solution {
    public int sumOfSquareOfDigits(int n) {
        int sum = 0;
        while(n > 0) {
            int dig = n % 10;
            sum  = sum + (dig * dig);
            n  = n / 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int slow = n, 
            fast = n;

        while(fast != 1) {
            slow = sumOfSquareOfDigits(slow);
            fast = sumOfSquareOfDigits(sumOfSquareOfDigits(fast));

            if(fast == 1) {
                return true;
            }

            if(slow == fast) {
                return false;
            }
        }

        return true;



        // HashSet<Integer> hs = new HashSet<>();

        // while(!hs.contains(n)) {
        //     hs.add(n);
        //     int sqrSum = 0;
        //     while(n != 0) {
        //         int rem = n % 10;
        //         sqrSum  += rem * rem;
        //         n = n/10;
        //     }
        //     if(sqrSum == 1) return true;
        //     else n =sqrSum;
        // }
        // return false;
    }
}