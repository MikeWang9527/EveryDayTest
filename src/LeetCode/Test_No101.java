package LeetCode;

/**
 * 对称二叉树
 */
public class Test_No101 {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    /**
     * 递归
     * @param t1
     * @param t2
     * @return
     */
    public boolean isMirror(TreeNode t1,TreeNode t2){
        if (t1==null&&t2==null){
            return true;
        }
        if (t1==null||t2==null){
            return false;
        }
        return (t1.val ==t2.val)&&isMirror(t1.right,t2.left)&&isMirror(t1.left,t2.right);
    }

    public boolean isSymmetric(TreeNode root){
        return isMirror(root,root);
    }

}
