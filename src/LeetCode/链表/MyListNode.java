package LeetCode.链表;

/**
 * @Author MikeWang
 * @Date 2020/7/1 2:34 下午
 */
public class MyListNode {
    public ListNode head;
    public ListNode current;

    //添加
    public void add(int val){
        if (head==null){
            head = new ListNode(val);
            current = head;
        }else {
            current.next = new ListNode(val);
            current = current.next;
        }
    }
    //打印
    public void print(ListNode node){
        if (node==null){
            return;
        }
        current =node;
        while (current!=null){
            System.out.println(current.data+"");
            current = current.next;
        }
    }
    //初始化
    public ListNode init(){
        for (int i = 0; i < 10; i++) {
            this.add(i);
        }
        return head;
    }

    public static void main(String[] args) {
        MyListNode listNode = new MyListNode();
        ListNode init = listNode.init();
        listNode.print(init);
    }
}
