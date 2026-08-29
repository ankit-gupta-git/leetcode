class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        Map<Character, Character> map = new HashMap<>();

        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for(int i = 0; i <  s.length(); i++){
            char c = s.charAt(i);

            if(!map.containsKey(c)) {
                //opening bracket
                stack.push(c);
            } else {
                //closing bracket
                if(stack.isEmpty()) {
                    return false;
                }

                //unresoled work is there 
                if(stack.peek() == map.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();

    //     for(char i : s.toCharArray()) {
    //         if(isBracketOpen(i)) {
    //             stack.push(i);
    //         } else {
    //             if (stack.size() == 0) {
    //                 return false;
    //             } else {
    //                 if (areBracketsMatching(stack.peek(), i)) {
    //                     stack.pop();
    //                 } else {
    //                     return false;
    //                 }
    //             }
    //         }
    //     }
    //     return stack.size() == 0;
    // }

    //     private boolean isBracketOpen(char c) {
    //         switch (c) {
    //             case '(':
    //             case '[':
    //             case '{':
    //                 return true;
    //             default:
    //                 return false;
    //         }
    //     }

    //     private boolean areBracketsMatching(char c, char d) {
    //         if(c == '(' && d == ')') {
    //             return true;
    //         } else if (c == '{' && d == '}') {
    //             return true;
    //         } else if (c == '[' && d == ']') {
    //             return true;
    //         } else {
    //             return false;
    //         }
        }
}