package LeetCode;


/**
 * @author MikeWang
 * @date 2022/8/10 3:12 PM
 */
public class Test_code {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int dp = nums[0];
        int max = dp;
        for (int i = 1; i < n; i++) {
            dp = Math.max(dp + nums[i], nums[i]);
            max = Math.max(max, dp);
        }
        return max;
    }


    public static void main(String[] args) {

        Test_code test = new Test_code();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(test.maxSubArray(nums));
    }

}
