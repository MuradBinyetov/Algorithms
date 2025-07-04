package solutions.leetcode;

public class minimum_Depth_Binary_Tree {
    public int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int leftDepth = minDepth(root.left);

        int rightDepth = minDepth(root.right);
        if(leftDepth ==0 || rightDepth == 0){ //bunu bele yazdim cunki root null olduqda return 0 olur Math.min 0-i qebul edirdi ona gore.
            return 1 + Math.max(leftDepth, rightDepth);
        }
        else{
            return 1 + Math.min(leftDepth, rightDepth);
        }
    }
}
