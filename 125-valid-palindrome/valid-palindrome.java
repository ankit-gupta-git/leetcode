class Solution {
    public boolean isAlphaNumericCharacter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    public boolean isPalindrome(String s) {
        //alphanumeric only
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");

        //2 pointers
        int i = 0, j = s.length() - 1;

        while(i < j) {

            if(!isAlphaNumericCharacter(s.charAt(i))) {
                i = i++;
                continue;
            }

            if(!isAlphaNumericCharacter(s.charAt(j))) {
                j = j--;
                continue;
            }

            if(s.charAt(i) != s.charAt(j)) {
                return false;
            } 
            i++;
            j--;
        }
            return true;
    }
}