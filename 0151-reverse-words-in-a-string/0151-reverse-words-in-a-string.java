class Solution {
    public String reverseWords(String s) {
        // // Brute Force
        // String trim = s.trim();

        // String[] arr = trim.split("\\s+");

        // int i = 0;
        // int j = arr.length - 1;

        // while (i < j) {
        //     String temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;

        //     i++;
        //     j--;
        // }

        // return String.join(" ", arr);


            // Optimized approach

            int l = 0, r = s.length() - 1;

            // Trim leading spaces
            while (l < s.length()) {
                if (s.charAt(l) == ' ') {
                    l++;
                } else {
                    break;
                }
            }

            // Trim trailing spaces
            while (r >= l) {
                if (s.charAt(r) == ' ') {
                    r--;
                } else {
                    break;
                }
            }

            // Skip extra spaces and append characters
            StringBuilder sb = new StringBuilder();

            while (l <= r) {
                if (s.charAt(l) != ' ') {
                    sb.append(s.charAt(l));
                    l++;
                } else if (sb.charAt(sb.length() - 1) != ' ') {
                    sb.append(' ');
                    l++;
                } else {
                    l++;
                }
            }

            // Reverse entire string
            int i = 0, j = sb.length() - 1;

            while (i < j) {
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);

                i++;
                j--;
            }

            // Reverse individual words
            int st = 0, end = 0;

            while (st < sb.length()) {
                while (end < sb.length() && sb.charAt(end) != ' ') {
                    end++;
                }

                int p1 = st;
                int p2 = end - 1;

                while (p1 < p2) {
                    char temp = sb.charAt(p1);
                    sb.setCharAt(p1, sb.charAt(p2));
                    sb.setCharAt(p2, temp);

                    p1++;
                    p2--;
                }

                st = end + 1;
                end = st;
            }

            return sb.toString();
    }
}