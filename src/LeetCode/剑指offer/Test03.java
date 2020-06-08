package LeetCode.剑指offer;

/**
 * @Author MikeWang
 * @Date 2020/6/8 10:03 上午
 * 青蛙跳台阶  青蛙可以一次跳一层 也可以一次跳两层 问n层台阶可以有几种跳法
 */
public class Test03 {
    /**
     * 1.n=1 1种
     * 2.n=2 2种
     * 3.n=3 1->2 1->1->1 2->1 3种
     * 4.n=4 1->1->1->1 1->2->1 1->1->2 2->1->1 2->2    5种
     * 5.n>1时 f(n-1)+f(n-2)种
     * @return
     */
    public int jumpFloor(int n){
        if(n<=2){
            return n;
        }
        int pre2 = 1; int pre1 =2 ;
        int result = 1;
        for (int i = 2; i < n; i++) {
            result = pre2 + pre1;
            pre2 = pre1;
            pre1 = result;
        }
        return result;
    }

    public static void main(String[] args) {
        Test03 test03 = new Test03();
        System.out.println(test03.jumpFloor(4));
    }
}
