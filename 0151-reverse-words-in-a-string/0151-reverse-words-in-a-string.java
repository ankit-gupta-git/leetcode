class Solution {
    public String reverseWords(String s) {
        // Brute Force
        String trim = s.trim();

        String[] arr = trim.split("\\s+");

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        return String.join(" ", arr);


            // //optimised one 
            // int l = 0, r = s.length() - 1;

            // //trim the leading spaces 
            // while(i < s.length()) {
            //     if (s.charAt(i) == ' ') {
            //         i++;
            //     } else {
            //         break;
            //     }

            // while(r >= 0) {
            //     if (s.charAt(r) == ' ') {
            //         i--;
            //     } else {
            //         break;
            //     }
            
            // //skip extra " " and append characters
            // StringBuilder sb = new StringBuilder();

            // while (l <= r) {
            //     if (s.charAt(l) != ' ') {
            //         sb.append(s.charAt(l));
            //         i++;
            //     } else if (sb.charAt(l) == ' ') {
            //         if(sb.charAt(sb.length() - 1) != ' ') {
            //             sb.append(' ');
            //             l++;
            //         } else {
            //             l++;
            //         }
            //     }
            // }


            // //now reverse
            // int i = 0, j = sb.length() - 1;

            // while(i < j) {
            //     char temp  = sb.charAt(i);
            //     sb.chatAt(i, sb.charAt(j));
            //     sb.chatAt(j, temp);

            //     i++;
            //     j--;
            // }

            // int st = 0, end = 0;

            // while (st < sb.length()) {
            //     while(st.sb.length())
            // }



        // }
    }
}