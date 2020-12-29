package suanfa;

import java.util.ArrayList;
import java.util.List;

public class sf02 {

    /**
     * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
     *
     * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
     *
     * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     *
     * 示例：
     *
     * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     * 输出：7 -> 0 -> 8
     * 原因：342 + 465 = 807
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/add-two-numbers
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * public class ListNode {
     *  *     int val;
     *  *     ListNode next;
     *  *     ListNode() {}
     *  *     ListNode(int val) { this.val = val; }
     *  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     *  * }
     *
     */
    public static void main(String[] args) {

        final ListNode l1 = new ListNode(2,new ListNode(4,new ListNode(3)));
        final ListNode l2 = new ListNode(5,new ListNode(6,new ListNode(4)));

        final ListNode listNode = new sf02().addTwoNumbers(l1, l2);

    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        ListNode listNode=null;
        ListNode returnList = null;

        ListNode l1c= l1;
        ListNode l2c = l2;

        int jw=0;
        while(l1c!=null || l2c !=null){

            if(l1c!=null && l2c!=null){
                final int i = l1c.val + l2c.val +jw;
                jw = i / 10;
                l1c= l1c.next;
                l2c = l2c.next;
                if(listNode == null){
                    listNode = new ListNode(i%10);
                    returnList= listNode;
                }else{
                    final ListNode listNode1 = new ListNode(i % 10);
                    listNode.next = listNode1;
                    listNode = listNode1;
                }
            }else if(l1c !=null){
                final int i = l1c.val + jw;
                jw = i/10;
                l1c = l1c.next;

                final ListNode listNode1 = new ListNode(i % 10);
                listNode.next = listNode1;
                listNode = listNode1;

            }else {
                final int i = l2c.val + jw;
                jw = i/10;
                l2c = l2c.next;
                final ListNode listNode1 = new ListNode(i % 10);
                listNode.next = listNode1;
                listNode = listNode1;
            }
        }
        if(jw!=0){
            final ListNode listNode1 = new ListNode(jw);
            listNode.next = listNode1;
        }

       return returnList;
    }


    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) {
          this.val = val;
      }
      ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
      }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }


}
