package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test_No350 {
    /**
     * 给定两个数组，编写一个函数来计算它们的交集。
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        //map存放num1数组 然后和num2数组比较  相同则减1 代表匹配到一个 最后转化数组
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                map.put(nums1[i], map.get(nums1[i]) + 1);
            } else {
                map.put(nums1[i], 1);
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                list.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }

        int count = list.size();
        int[] ans = new int[count];
        for (int i = 0; i < count; i++) {
            ans[i] = list.get(i);
        }

        return ans;

    }

}
