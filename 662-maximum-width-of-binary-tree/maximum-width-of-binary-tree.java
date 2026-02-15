/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        Queue<Pair<TreeNode, Long>> q = new LinkedList<>();
        q.offer(new Pair<>(root, 0L));
        int maxWidth = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            long start = q.peek().getValue();
            long end = start;

            for (int i = 0; i < size; i++) {
                Pair<TreeNode, Long> p = q.poll();
                TreeNode node = p.getKey();
                long idx = p.getValue();
                end = idx;

                if (node.left != null) {
                    q.offer(new Pair<>(node.left, idx * 2 + 1));
                }
                if (node.right != null) {
                    q.offer(new Pair<>(node.right, idx * 2 + 2));
                }
            }

            maxWidth = Math.max(maxWidth, (int)(end - start + 1));
        }

        return maxWidth;
    }
}
