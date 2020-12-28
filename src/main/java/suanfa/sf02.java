package suanfa;

import java.util.ArrayList;

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


        final ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        final ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));

        final ListNode listNode = new sf02().addTwoNumbers(l1, l2);

    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

         ListNode listNode = new ListNode();
         listNode = l1;
        int i=0;
        int l1s =0;
        while (listNode!=null){
            if(i==0){
                l1s = listNode.val;
            }else {
                l1s = (int) (l1s+ listNode.val*Math.pow(10,i));
            }
            listNode=listNode.next;
            i++;
        }

        i=0;
        int l2s =0;
        listNode = l2;
        while (listNode!= null){
            if(i==0){
                l2s = listNode.val;
            }else {
                l2s = (int) (l1s + listNode.val*Math.pow(listNode.val,i));
            }
            listNode=listNode.next;
            i++;
        }
        int sum = l1s + l2s;

     //   while ()




        return null;
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
    }

}
