/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-20
 * Time: 18:54
 * Description:
 */
public class LC102BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) {
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            //size represent current number of nodes
            List<Integer> list1 = new ArrayList<>();
            while (size != 0) {
                TreeNode node = queue.poll();
                list1.add(node.val);
                size--;
                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
            }
            list.add(list1);
        }

        return list;
    }
}
