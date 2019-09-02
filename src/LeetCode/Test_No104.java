package LeetCode;

/**
 * 二叉树的最大深度
 */
public class Test_No104 {
    /**
     * Definition for a binary tree node.
     */
      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    /**
     * 递归    深度优先搜索算法(DFS)
     * @param root
     * @return
     */
    public static int maxDepth(TreeNode root) {
          if (root==null){
              return 0;
          }else {
              int left_height = maxDepth(root.left);
              int right_height = maxDepth(root.right);
              return java.lang.Math.max(left_height,right_height)+1;
          }
    }



}
