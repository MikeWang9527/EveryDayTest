package LeetCode.数组;

/**
 * @Author MikeWang
 * @Date 2020/6/30 2:25 下午
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/container-with-most-water
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 解法: 双指针
 */
public class LeetCodeNo12 {
    //height 是Y轴列表
    public int maxArea(int[] height) {
        //横坐标的左端以及右端
        int left = 0;
        int right = height.length-1;
        int area = 0;
        while (left<right){
            int cur = Math.min(height[left],height[right])*(right-left);
             area = Math.max(cur,area);
             //要想面积大,较短的垂直线往中间移动
             if (height[left]<height[right]){
                 left = left+1;
             }else{
                 right = right-1;
             }
        }
        return area;
    }
}
