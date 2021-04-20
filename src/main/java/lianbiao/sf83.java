package lianbiao;

import java.util.List;

public class sf83 {


    /**
     * 存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除所有重复的元素，使每个元素 只出现一次 。
     * 返回同样按升序排列的结果链表。
     * @param args
     */
    public static void main(String[] args) {
        final ListNode listNode = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        final sf83 sf83 = new sf83();
        final ListNode listNode1 = sf83.deleteDuplicates(listNode);
        System.out.println(listNode1.toString());
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        head.next = deleteDuplicates(head.next);
        if(head.val == head.next.val){
            head = head.next;
        }
        return head;
    }
}
