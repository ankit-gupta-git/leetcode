class Node {
    Node child[];
    Node() {
        child = new Node[10]; // 0 to 9 digits
    }
}

class Trie {
    Node root;
    Trie() {
        root = new Node();
    }

    public void addWord(String word) {
        Node temp = root;
        for(char ch : word.toCharArray()) {
            int index = ch - '0';
            if(temp.child[index] == null) {
                temp.child[index] = new Node();
            }
            temp = temp.child[index];
        }
    }

    public int findPrefix(String word) {
        Node temp = root;
        int len = 0;
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - '0';
            if(temp.child[index] == null) {
                break;
            }

            temp = temp.child[index];
            len++;
        }
        return len;
    }


}


class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Trie trie = new Trie();
        int maxLen = Integer.MIN_VALUE;
        for(int arr : arr1) {
            trie.addWord(Integer.toString(arr));
        }
        for(int arr : arr2) {
            int len = trie.findPrefix(Integer.toString(arr));
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }
}