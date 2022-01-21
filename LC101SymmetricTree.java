/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-20
 * Time: 17:34
 * Description:
 */
public class LC101SymmetricTree {
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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return false;

        return isSymmetricChild(root.left, root.right);
    }

    public boolean isSymmetricChild(TreeNode left, TreeNode right) {
        if((left != null && right == null) || (left == null && right != null)) {
            return false;
        }

        if(left == null && right == null) {
            return true;
        }

        if(left.val != right.val) {
            return false;
        }
        return isSymmetricChild(left.right, right.left) && isSymmetricChild(left.left, right.right);
    }
}
