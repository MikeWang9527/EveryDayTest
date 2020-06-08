package LeetCode.剑指offer;

/**
 *
 * @Author MikeWang
 * @Date 2020/5/7 5:25 下午
 */

import java.util.Arrays;
import java.util.Comparator;

/**
 * 给定一个二维数组，其每一行从左到右递增排序，从上到下也是递增排序。给定一个数，判断这个数是否在该二维数组中。
 * 思路:该二位数组中的一个数小于它的数一定在其左边，大于它的数一定在其下边。因此，从右上角开始查找，就可以根据target和当前元素的大小关系来缩小查找范围
 */
public class Test01 {
    public  boolean Find(int target,int[][] matrix){
        if (matrix==null||matrix.length==0||matrix[0].length==0){
            return false;
        }
        //行
        int rows = matrix.length;
        //列
        int cols = matrix.length;
        int r = 0;int c = cols-1;//从右上角开始
        while (r<=rows-1&&c>=0){
            if (target==matrix[r][c]){
                return true;
            }else if (target>matrix[r][c]){
                r++;//行向下移动
            }else{
                c--;//列向前移动
            }
        }
        return false;

    }

}
