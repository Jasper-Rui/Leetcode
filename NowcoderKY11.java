/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-20
 * Time: 18:19
 * Description:
 */

import java.util.Scanner;

class TreeNode {
    public char val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode (char val) {
        this.val = val;
    }
}

public class NowcoderKY11 {
    public static int i = 0;
    public static TreeNode createTree(String str) {
        TreeNode root = null;
        if(str.charAt(i) != '#') {
            root = new TreeNode(str.charAt(i));
            i++;
            root.left = createTree(str);
            root.right = createTree(str);
        }
        else {
            i++;
        }
        return root;
    }

    public static void inorder (TreeNode root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String str = in.nextLine();
            TreeNode root = createTree(str);
            inorder(root);
        }
    }
}
