package LeetCode.剑指offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MikeWang
 * @date 2021/4/28 3:26 下午
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Test10_青蛙跳台阶 {
    Map<Integer,Integer> temMap = new HashMap<>();
    //利用递归加备忘录
    public int numWays(int n) {
        if (n==0){
            return 1;
        }
        if (n<=2){
            return n;
        }
        //查看备忘录里面有没有
        if (temMap.containsKey(n)){
            return temMap.get(n);
        }else{
            temMap.put(n,(numWays(n-1)+numWays(n-2))%1000000007);
            return temMap.get(n);
        }
    }
}
