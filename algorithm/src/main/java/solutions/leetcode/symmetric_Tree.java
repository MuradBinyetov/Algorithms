package solutions.leetcode;

public class symmetric_Tree {
    public boolean isSymmetric(TreeNode root) {
        return helperMethod(root, root);
    }

    private boolean helperMethod(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null || root1.val != root2.val) {
            return false;
        }
        return helperMethod(root1.left, root2.right) && helperMethod(root1.right, root2.left);
    }
}
