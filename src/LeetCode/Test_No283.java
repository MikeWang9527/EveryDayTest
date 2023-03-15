package LeetCode;

public class Test_No283 {

    /**
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     * <p>
     * 1.必须在原数组上操作，不能拷贝额外的数组。
     * 2.尽量减少操作次数。
     * <p>
     * 输入: [0,1,0,3,12]
     * 输出: [1,3,12,0,0]
     */
    //解法1 双指针  一个指针用来遍历数组，一个指针用来指向0元素，遇到非0元素则交换 ，最终会将所有非0元素交换到最前
    public static void moveZeroes(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swapArrays(nums, i, k++);
            }
        }


    }

    private static void swapArrays(int[] nums, int first, int second) {
        if (first == second) {
            return;
        }
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
//        moveZeroes(nums);
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
        moveZeroes2(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }

    //解法二 使用指针i，指向需要插入的下标,使用指针j指向遍历的下标，遍历一遍，如果j指向的位置为0，则i不变`，
    // j++后移；如果j指向的位置不为0，则将进位制的元素值赋值到i位置，然后i++
    public static void moveZeroes2(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }
        for (int p = i; p < nums.length; p++) {
            nums[p] = 0;
        }
    }
}
