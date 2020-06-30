package LeetCode.数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author MikeWang
 * @Date 2020/6/30 11:52 上午
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 解法: 排序+双指针
 */
public class LeetCodeNo15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        //边界判断
        if(nums==null||nums.length<3){
            return lists ;
        }
        //排序
        Arrays.sort(nums);
        //双指针
        int len = nums.length;
        for (int i = 0; i < len-1; i++) {
            if (i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int cur = nums[i];
            int L = i+1;
            int R = len-1;
            while (L<R){
                int tmp = cur+nums[L]+nums[R];
                if (tmp ==0){
                    List<Integer> list = new ArrayList<>();
                    list.add(cur);
                    list.add(nums[L]);
                    list.add(nums[R]);
                    lists.add(list);
                    //判断左右界与下个位置是否重复，去除重复解,并将L,R移到下个位置
                    while (L<R&&nums[L]==nums[L+1]) {
                        ++L;
                    }
                    while (L<R&&nums[R]==nums[R-1]) {
                        --R;
                    }
                    ++L;
                    --R;
                }else if(tmp<0){
                    ++L;
                }else {
                    --R;
                }
            }
        }
        return lists;
    }
}
