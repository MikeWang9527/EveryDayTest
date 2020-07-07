package LeetCode.链表;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author MikeWang
 * @Date 2020/7/6 2:13 下午
 * 反转链表
 */
public class LeetCodeNo206 {


    //双指针迭代
    public ListNode reverseList(ListNode head) {
            //tmp 保存下一个节点
            ListNode pre = null;
            ListNode cur = head;
            ListNode tmp = null;
            while (cur!=null){
                //记录当前节点的下一个节点  比如： 1 -> 2 -> 3 -> 4 -> 5 ，假设现在 cur 指向2，cur.next 就代表了后面的一串： 3 -> 4 -> 5
                tmp = cur.next;
                cur.next = pre;
                pre = cur;
                cur = tmp;
            }
            return pre;
        }


    public static void main(String[] args) {
        MyListNode listNode = new MyListNode();
        ListNode init = listNode.init();
        listNode.print(init);
       LeetCodeNo206 leetCodeNo206 = new LeetCodeNo206();
       leetCodeNo206.reverseList(init);
    }
    }

