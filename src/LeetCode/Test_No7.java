package LeetCode;

/**
 * 将这个数字转换为字符串
 * 判断首个字符是否‘-‘，如果是，运算过程不要处理字符串的首位，并在最后返回最终结果时乘-1
 * 由后至前逐个提取字符串中的数字类型数字，并进行运算。结果用long类型储存。
 * 第二步运算过程判断结果是否溢出
 *
 */
public class Test_No7 {
    public int reverse(int x) {
        StringBuilder stringBuilder = new StringBuilder();
        if (x<0){
            x=-x;
            stringBuilder.append("-");
        }
        while (x>0){
            //取余数
            stringBuilder.append(x%10);
            //取商
            x/=10;
        }
        try {
            return Integer.parseInt(stringBuilder.toString());
        }catch (Exception e){
            return 0;
        }

    }
}
