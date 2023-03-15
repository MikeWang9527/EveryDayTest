package LeetCode;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 */
public class Test_No53 {

    /**
     * sum>0 保留并加上当前遍历数字
     * sum<=0 sum更新位当前遍历数字
     * 每次比较sum 和ans的大小，将最大值置为ans,遍历结束返回结果
     *
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        //ans存放最大值
        int ans = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
