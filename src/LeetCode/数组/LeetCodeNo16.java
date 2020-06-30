package LeetCode.数组;

import javax.xml.transform.Result;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author MikeWang
 * @Date 2020/6/30 2:38 下午
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 *
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum-closest
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCodeNo16 {
    public int threeSumClosest(int[] nums, int target) {
        int result = 0;
        if(nums!=null&&nums.length>=3){
            //排序
            Arrays.sort(nums);
            //初始化
            result = nums[0]+nums[1]+nums[2];
            for (int i = 0; i < nums.length - 2; i++) {
                int left = i+1;
                int right = nums.length-1;
                while (left!=right){
                    int sum = nums[i]+nums[left]+nums[right];
                    //比较target和result的绝对值以及sum和target的绝对值 更新更小的到result中;
                    if (Math.abs(sum-target)<Math.abs(result-target)){
                        result = sum;
                    }
                    //因为有序,sum大于target代表 right向左移,可以减小sum
                    if (sum>target){
                        right--;
                    }else {
                        left++;
                    }
                }
            }

        }
        return result;
    }
}
