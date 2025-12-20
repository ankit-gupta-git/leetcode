class Solution {
    static final long M = 1000000007;

    long findPower(long a, long b) {
        if (b == 0) return 1;

        long half = findPower(a, b / 2);
        long result = (half * half) % M;

        if (b % 2 == 1) {
            result = (result * a) % M;
        }

        return result;
    }

    public int countGoodNumbers(long n) {
        long evenPos = (n + 1) / 2;
        long oddPos = n / 2;

        long ans = (findPower(5, evenPos) * findPower(4, oddPos)) % M;
        return (int) ans;
    }
}
