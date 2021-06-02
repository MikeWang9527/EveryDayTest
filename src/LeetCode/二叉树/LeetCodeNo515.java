package LeetCode.二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MikeWang
 * @date 2021/6/2 5:30 下午
 *
 * 您需要在二叉树的每一行中找到最大的值。
 */
public class LeetCodeNo515 {

    List<Integer> res = new ArrayList<>();

    public List<Integer> largestValues(TreeNode root){
        dfs(root,0);
        return res;
    }

    private void dfs(TreeNode root,int depth){
        if (root == null){
            return;
        }
        if (depth==res.size()){
            res.add(root.val);
        }else {
            res.set(depth,Math.max(res.get(depth), root.val));
        }
        depth++;
        dfs(root.right,depth);
        dfs(root.left,depth);

    }
}
