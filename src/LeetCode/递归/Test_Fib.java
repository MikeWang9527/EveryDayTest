package LeetCode.递归;

import java.util.HashMap;
import java.util.Map;

/**
 * 斐波那契数
 * F(0) = 0 F(1) = 1
 * F(N) = F(N-1)+F(N-2),其中N>1
 */
public class Test_Fib {

    //动态规划
    public static int fib1(int N) {
        if (N <= 1) {
            return N;
        }
        int[] dp = new int[N + 1];
        dp[1] = 1;
        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[N];
    }

    //优化动态规划   只记录前两个状态
    public static int fib2(int N) {
        if (N <= 1) {
            return N;
        }
        int pre = 0, cur = 1;
        for (int i = 2; i <= N; i++) {
            int next = pre + cur;
            pre = cur;
            cur = next;
        }
        return cur;
    }


    //递归
    public int fib3(int N) {
        if (N <= 1) {
            return N;
        }
        return fib3(N - 1) + fib3(N - 2);
    }


    //记忆化递归  计算过的就不重复计算
    Map<Integer, Integer> map = new HashMap<>();

    public int fib4(int N) {
        if (N <= 1) {
            return N;
        }

        if (map.containsKey(N)) {
            return map.get(N);
        }
        int result = fib4(N - 1) + fib4(N - 2);
        map.put(N, result);
        return result;

    }


}
