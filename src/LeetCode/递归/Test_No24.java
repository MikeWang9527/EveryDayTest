package LeetCode.递归;

/**
 * 两两交换链表中的节点
 */
public class Test_No24 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * 调用单元为head 和head.next相邻两个元素
     * 终止条件:head为空指针或者next为空指针,也就是当前无节点或者只有一个节点，无法进行交换
     *
     * @param head
     * @return
     */
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }


}
