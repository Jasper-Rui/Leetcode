/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-19
 * Time: 15:12
 * Description:
 */
public class LC100SameTree {
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
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if((p == null && q != null) || (p != null && q == null)) return false;

            if(p == null && q == null) return true;

            if((p != null && q != null) && (p.val != q.val)) return false;

            return (isSameTree(p.left, q.left)) && (isSameTree(p.right, q.right));
        }
    }
}
