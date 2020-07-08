package LeetCode.链表;

/**
 * @Author MikeWang
 * @Date 2020/7/8 10:48 上午
 * 删除链表中等于给定值 val 的所有节点。
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 * 想要删除某个节点，就必须找到这个节点的前一个节点，把前一个节点的指针改变，即指向下下一个就可以达到删除的目的了
 */
public class LeetCodeNo203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head==null){
            return head;
        }
        ListNode solider = new ListNode(0);
        //solider指向head节点
        solider.next = head;
        //前置节点
        ListNode pre = solider;
        //当前节点
        ListNode cur = head;
        while (cur!=null){
            if (cur.data.equals(val)){
                pre.next = cur.next;
            }else {
                pre = cur;
            }
            cur = cur.next;
        }
        return solider.next;
    }
}
