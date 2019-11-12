package LeetCode.栈;
//数组实现顺序栈
public class ArrayStack {
    //数组
    private String[] items;
    //栈中元素个数
    private int count;
    //栈的大小
    private int n;

    //初始化数组
    public ArrayStack(int n){
        this.items = new String[n];
        this.n = n;
        this.count = 0;
    }

    //入栈
    public boolean push(String item){
        //空间不足，入栈失败
        if (count == n){
            return false;
        }
        //将item放到下标为count的位置,并且count加一
        items[count] = item;
        ++count;
        return true;
    }

    //出栈
    public String pop(){
        if (count ==0){
            return null;
        }
        String tmp = items[count-1];
        --count;
        return tmp;
    }


}
