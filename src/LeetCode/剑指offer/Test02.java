package LeetCode.剑指offer;

/**
 * @Author MikeWang
 * @Date 2020/6/5 6:17 下午
 */
public class Test02 {

    public int Fibonacci(int n){
        if (n<=1){
            return n;
        }
        int[] fib  = new int[n+1];
        fib[1] = 1;
        for (int i = 2; i <=n; i++) {
            fib[i] = fib[i-1]+fib[i-2];
        }
        return fib[n];
    }

    public static void main(String[] args) {
        Test02 test02 = new Test02();
        int fibonacci = test02.Fibonacci(11);
        System.out.println(fibonacci);
    }
}
