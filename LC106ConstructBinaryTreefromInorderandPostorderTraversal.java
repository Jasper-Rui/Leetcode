/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-21
 * Time: 20:02
 * Description:
 */
public class LC106ConstructBinaryTreefromInorderandPostorderTraversal {
    public int postIndex;
    public TreeNode createTreeByPreAndIn(int[] inorder, int[] postorder, int inbegin, int inend) {
        if(inbegin > inend) return null;

        TreeNode root = new TreeNode(postorder[postIndex]);
        int rootindex = findIndexofInorder(inorder, inbegin, inend, postorder[postIndex]);
        if(rootindex == -1) {
            return null;
        }

        postIndex--;
        root.right = createTreeByPreAndIn(inorder, postorder, rootindex + 1, inend);
        root.left = createTreeByPreAndIn(inorder, postorder, inbegin, rootindex - 1);
        return root;
    }

    private int findIndexofInorder (int[] inorder, int inbegin, int inend, int key) {
        for(int i = inbegin; i <= inend; i++) {
            if(inorder[i] == key) return i;
        }
        return -1;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length - 1;
        if(postorder == null || inorder == null) return null;

        return createTreeByPreAndIn(inorder, postorder, 0, inorder.length - 1);
    }
}
