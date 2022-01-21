/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-19
 * Time: 21:41
 * Description:
 */
public class LC572SubtreeofAnotherTree {
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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null || subRoot == null) return false;

        if(isSameTree(root, subRoot)) {
            return true;
        }

        if(isSubtree(root.right, subRoot)) {
            return true;
        }

        return isSubtree(root.right, subRoot) || isSubtree(root.left, subRoot);
        /*if(isSubtree(root.right, subRoot)) {
            return true;
        }
        return isSubtree(root.left, subRoot);*/
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if((p == null && q != null) || (p != null && q == null)) return false;

        if(p == null && q == null) return true;

        if((p != null && q != null) && (p.val != q.val)) return false;

        return (isSameTree(p.left, q.left)) && (isSameTree(p.right, q.right));
    }

}
