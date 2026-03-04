class Solution {
    // public boolean isAlphaNumericCharacter(char c) {
    //     return (c >= 'a' && c <= 'z') || 
    //            (c >= 'A' && c <= 'Z') || 
    //            (c >= '0' && c <= '9');
    // }
    //2 pointers
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            char left = s.charAt(i);
            char right = s.charAt(j);

            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;   
                continue;
            }

            if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;   
                continue;
            }

            if (Character.toLowerCase(left) 
                != Character.toLowerCase(right)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}