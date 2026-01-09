class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    private void helper(TreeNode root, List<Integer> res) {
        if (root == null) return;

        res.add(root.val);          // Root
        helper(root.left, res);     // Left
        helper(root.right, res);    // Right
    }
}
