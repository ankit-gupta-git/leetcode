class Solution {

    static class TrieNode {
        TrieNode zero, one;
    }

    // Insert number into trie
    static void insert(TrieNode root, int n) {
        TrieNode curr = root;

        for(int i = 31; i >= 0; i--) {

            int bit = (n >> i) & 1;

            if(bit == 0) {

                if(curr.zero == null) {
                    curr.zero = new TrieNode();
                }

                curr = curr.zero;

            } else {

                if(curr.one == null) {
                    curr.one = new TrieNode();
                }

                curr = curr.one;
            }
        }
    }

    // Find maximum XOR possible for a number
    static int findMaxXor(TrieNode root, int n) {

        TrieNode curr = root;
        int ans = 0;

        for(int i = 31; i >= 0; i--) {

            int bit = (n >> i) & 1;

            // If current bit is 1 → try 0
            if(bit == 1) {

                if(curr.zero != null) {
                    ans += (1 << i);
                    curr = curr.zero;
                } else {
                    curr = curr.one;
                }

            }

            // If current bit is 0 → try 1
            else {

                if(curr.one != null) {
                    ans += (1 << i);
                    curr = curr.one;
                } else {
                    curr = curr.zero;
                }
            }
        }

        return ans;
    }

    public int findMaximumXOR(int[] nums) {

        TrieNode root = new TrieNode();

        int n = nums.length;

        // Insert all numbers into trie
        for(int i = 0; i < n; i++) {
            insert(root, nums[i]);
        }

        int ans = 0;

        // Find max XOR
        for(int i = 0; i < n; i++) {
            ans = Math.max(ans, findMaxXor(root, nums[i]));
        }

        return ans;
    }
}