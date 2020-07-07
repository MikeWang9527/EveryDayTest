package LeetCode.链表;

/**
 * @Author MikeWang
 * @Date 2020/7/6 1:46 下午
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * 终止条件:两个链表为空
 * 如何递归: 判断l1和l2哪个头结点小,然后较小结点的 next 指针指向其余结点的合并结果。（调用递归）
 */

public class LeetCodeNo21 {

    /**
     * Definition for singly-linked list.
     */
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        else if (l2==null){
            return l1;
        }
        else if (l1.val<l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }
    }
}
