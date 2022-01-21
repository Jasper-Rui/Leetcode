/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-19
 * Time: 23:04
 * Description:
 */
public class LC110BalancedBinaryTree {
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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        if(Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1) {
            return isBalanced(root.left) && isBalanced(root.right);
        }

        return false;

    }


    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        if(root.right == null && root.left == null) {
            return 1;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
