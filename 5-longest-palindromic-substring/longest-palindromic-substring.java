class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) return s;

        String LPS = "";

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome
            int low = i, high = i;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
            }
            String p1 = s.substring(low + 1, high);
            if (p1.length() > LPS.length()) LPS = p1;

            // Even length palindrome
            low = i - 1;
            high = i;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
            }
            String p2 = s.substring(low + 1, high);
            if (p2.length() > LPS.length()) LPS = p2;
        }

        return LPS;
    }
}
