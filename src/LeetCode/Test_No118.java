package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角
 */
public class Test_No118 {
    //整体思路：每行是一个集合类型
    //然后按一定的规则把每行的元素加进去
    //最后把每行添加到一个集合中去
    public class Soulation{
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> list = new ArrayList<>();
            //如果输入的数小于等于零那么就返回空集合
            if (numRows<=0){
                return list;
            }
            list.add(new ArrayList<>());
            //集合的第一位都是1
            list.get(0).add(1);
            for (int i = 0; i < numRows; i++) {
                List<Integer> row = new ArrayList<>();
                //获取一个当前元素的上一个元素(上一行)
                List<Integer> prevrow = list.get(i - 1);
                row.add(1);
                //控制每行还可以添加多少元素
                for (int j = 0; j < i; j++) {
                    row.add(prevrow.get(j)+prevrow.get(j-1));
                }
                //在每行最后一格添加1
                row.add(1);
                //把集合加入的大的集合中
                list.add(row);
            }
            return list;
        }
    }
}
