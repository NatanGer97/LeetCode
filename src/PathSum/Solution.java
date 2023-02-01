package PathSum;


import javax.swing.tree.*;

public class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        int currentSum = 0;

        return  rootToLeafSum(root, targetSum,currentSum);
    }

    private boolean rootToLeafSum(TreeNode subRoot, int targetSum, int currentSum){
        if (subRoot == null) return false;
        if (isLeaf(subRoot))
        {
            currentSum += subRoot.val;
            if (currentSum == targetSum) return  true;
        }

        return rootToLeafSum(subRoot.left, targetSum, currentSum + subRoot.val) || rootToLeafSum(subRoot.right, targetSum, currentSum + subRoot.val);
    }

    private boolean isLeaf(TreeNode subRoot) {
        return subRoot.left == null && subRoot.right == null;
    }
}
