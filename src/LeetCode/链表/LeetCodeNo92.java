package LeetCode.链表;

/**
 * @Author MikeWang
 * @Date 2020/7/7 6:13 下午
 * 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
 * 输入: 1->2->3->4->5->NULL, m = 2, n = 4
 * 输出: 1->4->3->2->5->NULL
 * 递归
 */
public class LeetCodeNo92 {

    //后驱节点
    ListNode successor = null;
    //反转以head为起点的n个节点,返回新的头结点
    public ListNode reverseN(ListNode head,int n){
        if (n==1){
            //记录第n+1的节点
            successor = head.next;
            return head;
        }
        //以head.next为起点,需要反转前n-1的节点
        ListNode last = reverseN(head.next, n - 1);
        head.next.next = head;
        //让反转后的head节点和后面的节点连起来
        head.next = successor;
        return last;
    }


    public ListNode reverseBetween(ListNode head, int m, int n) {
        //base case
        if (m==1) {
            return reverseN(head, n);
        }
            //前进到反转的起点触发base case
            head.next = reverseBetween(head.next, m - 1, n - 1);
            return head;
    }
}
