class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
                continue;
            }

            int temperature = temperatures[i];

            while (!stack.isEmpty() && temperature > temperatures[stack.peek()]) {
                int idx = stack.pop();
                int diff = i - idx;
                res[idx] = diff;
            }

            stack.push(i);
        }
        return res;

    }
}