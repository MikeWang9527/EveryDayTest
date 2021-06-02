package LeetCode.二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MikeWang
 * @date 2021/6/2 5:15 下午
 * 给定一棵二叉树，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。
 */
public class LeetCodeNo199 {

    List<Integer> res = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root){
        dfs(root,0);
        return res;
    }


    private void dfs(TreeNode root,int depth){
        if (root==null){
            return;
        }
        //先访问 当前节点，再递归地访问 右子树 和 左子树。
        /// 如果当前节点所在深度还没有出现在res里，说明在该深度下当前节点是第一个被访问的节点，因此将当前节点加入res中。
        if (depth==res.size()){
            res.add(root.val);
        }
        depth++;
        dfs(root.right,depth);
        dfs(root.left,depth);
    }

}
