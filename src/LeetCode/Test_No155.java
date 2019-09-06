package LeetCode;

import java.util.Stack;

/**
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * push(x) -- 将元素 x 推入栈中。
 * pop() -- 删除栈顶的元素。
 * top() -- 获取栈顶元素。
 * getMin() -- 检索栈中的最小元素。
 *
 */
public class Test_No155 {


    /**
     * 借用辅助栈，用于存获取stack中最小值
     */
    private Stack<Integer> stack;
    private Stack<Integer> min_stack;
    public Test_No155(){
        stack = new Stack<>();
        min_stack = new Stack<>();
    }

    public void push(int x){
        stack.push(x);
        if (min_stack.isEmpty()||x<=min_stack.peek()){
            min_stack.push(x);
        }
    }

    public void pop(){
        //出栈看是否是min_stack的栈顶元素(最小值) 如果是则将最小值一起pop
        if (stack.pop().equals(min_stack.peek())){
            min_stack.pop();
        }
    }

    public int top(){
        return stack.peek();
    }

    public int getMin(){
        return min_stack.peek();
    }




}
