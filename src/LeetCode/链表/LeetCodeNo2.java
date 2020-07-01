package LeetCode.链表;

/**
 * @Author MikeWang
 * @Date 2020/7/1 10:19 上午
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCodeNo2 {

    public class ListNode {
        int val;

        ListNode next;

        ListNode(int x) {
            val = x;
        }

    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = null;
        ListNode a = l1;
        ListNode b = l2;
        //进位标志
        int carry = 0;
        while (a != null || b != null) {
            //a和b节点的值相加,如果有进位还要加上进位的值
            int val = (a == null ? 0 : a.val) + (b == null ? 0 : b.val) + carry;
            //根据val值判断是否有进位
            carry = val >= 10 ? 1 : 0;
            val = val % 10;
            p = a == null ? b : a;
            p.val = val;
            //a和b指针都前进一位
            a = (a == null ? null : a.next);
            b = (b == null ? null : b.next);
            //根据a和b是否为空,p指针也前进一位
            p.next = a == null ? b : a;
        }
        //如果循环结束carry>0说明有进位需要处理这个条件
        if (carry > 0) {
            p.next = new ListNode(1);
        }
        //每次迭代实际上都是将val赋给a指针,所以最后返回的是l1
        return l1;
    }

}
