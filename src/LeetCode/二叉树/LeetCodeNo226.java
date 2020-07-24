package LeetCode.二叉树;

/**
 * @Author MikeWang
 * @Date 2020/7/9 5:02 下午
 * 翻转一棵二叉树。
 */
public class LeetCodeNo226 {
    public TreeNode invertTree(TreeNode root) {
        //终止条件,节点为空时返回
        if (root==null){
            return null;
        }
        //交换
        TreeNode tmp = root.right;
         root.right = root.left;
         root.left = tmp;
         //递归左子树
        invertTree(root.left);
        //递归右子树
        invertTree(root.right);

        return root;
    }
}
