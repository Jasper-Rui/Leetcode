/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-21
 * Time: 0:38
 * Description:
 */
public class NowCoderJZ36BinaryTreeToLinkedlist {

    /**
     public class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
     this.val = val;

     }

     }
     */

    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null) {
            return null;
        }
        inOrder(pRootOfTree);
        TreeNode head = pRootOfTree;
        while (head.left != null) {
            head = head.left;
        }
        return head;
    }
    TreeNode prev = null;

    public void inOrder (TreeNode root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        root.left = prev;
        if(prev != null) {
            prev.right = root;
        }
        prev = root;
        inOrder(root.right);
    }
}
