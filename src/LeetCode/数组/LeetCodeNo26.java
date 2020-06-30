package LeetCode.数组;

import java.util.Arrays;

/**
 * @Author MikeWang
 * @Date 2020/6/30 2:39 下午
 *
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 解法:双指针
 */
public class LeetCodeNo26 {
    public int removeDuplicates(int[] nums) {
        //从第二个元素开始 对应不同元素的下标
        int len = 1;
        if (nums!=null&&nums.length>=2){
            //第一个元素作为重复元素存放地址
            int val = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (val!=nums[i]){
                    val = nums[i];
                    //将不同的数据放到数组的前面
                    nums[len] = nums[i];
                    len++;
                }
            }
        }
        return len;
    }
}
