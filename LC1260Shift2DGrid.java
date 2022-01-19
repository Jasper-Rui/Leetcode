import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-12
 * Time: 19:13
 * Description:
 */
public class LC1260Shift2DGrid {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int m = grid.length;;
        int n = grid[0].length;

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                list.add(grid[i][j]);
            }
        }

        while (k > 0) {
            int temp = list.remove(list.size() - 1);
            list.add(0, temp);
            k--;
        }

        List<List<Integer>> list1 = new ArrayList<>();
        for (int i = 0; i < m; i++){
            list1.add(list.subList(i * n, (i + 1) * n));
        }

        return list1;
    }


    public static void main(String[] args) {

    }

    /**
     * Created with IntelliJ IDEA.
     * Description:
     * User: JasperRui
     * Date: 2022-01-19
     * Time: 15:12
     * Description:
     */
    public static class SameTree {
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
}
