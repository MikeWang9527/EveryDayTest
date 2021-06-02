package LeetCode.二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MikeWang
 * @date 2021/6/2 5:39 下午
 * 给定一个非空二叉树, 返回一个由每层节点平均值组成的数组。
 */
public class LeetCodeNo637 {
    //存放层节点数量
    List<Integer> counts = new ArrayList<>();
    //存放层平均数
    List<Double> sums = new ArrayList<>();

    public List<Double> averageOfLevels(TreeNode root) {
        dfs(root,0);
        for (int i = 0; i < sums.size(); i++) {
            sums.set(i,sums.get(i)/counts.get(i));
        }
        return sums;
    }

    public void dfs(TreeNode root,int depth){
        if (root==null){
            return;
        }
        if (depth<sums.size()){
            sums.set(depth,sums.get(depth)+ root.val);
            counts.set(depth,counts.get(depth)+1);
        }else {
            sums.add(1.0* root.val);
            counts.add(1);
        }
        depth++;
        dfs(root.right, depth);
        dfs(root.left, depth);
    }
}
