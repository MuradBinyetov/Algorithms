package solutions.leetcode;

public class path_Sum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);

    }

//    private boolean helperMethod(TreeNode root, int sum,int targetSum){
//        if(root.left == null && root.right == null && root.val != sum){
//            return false;
//        }else{
//            if(root.left != null && root.left.val+sum < targetSum){
//                return helperMethod(root.left, sum + root.val, targetSum);
//            }
//            if(root.right != null && root.right.val+sum < targetSum){
//                return helperMethod(root.right, sum + root.val,targetSum);
//            }
//            return false;
//        }
//    }
}
