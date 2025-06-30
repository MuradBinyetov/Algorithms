package solutions.leetcode;

public class same_Tree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p!=null && q!=null && p.val == q.val){
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        else return p == null && q == null;
    }
}

