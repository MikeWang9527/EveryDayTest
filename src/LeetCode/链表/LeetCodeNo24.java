package LeetCode.链表;

/**
 * @Author MikeWang
 * @Date 2020/7/7 1:39 下午
 * 两两交换链表中的节点
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *  递归
 */
public class LeetCodeNo24 {
    public ListNode swapPairs(ListNode head) {
        //递归的终止条件
        if (head==null||head.next==null){
            return head;
        }
        //1->2->3->4
        //保存节点2
        ListNode tmp = head.next;
        //继续递归,处理节点3->4
        //当递归结束返回后,变成4->3
        //head节点指向4 变成1->4->3
        head.next = swapPairs(tmp.next);
        //将2节点指向1
        tmp.next = head;
        return tmp;
    }
}
