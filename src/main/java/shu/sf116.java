package shu;

public class sf116 {


    /**
     * 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
     *
     * 初始状态下，所有 next 指针都被设置为 NULL。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */
    public static void main(String[] args) {

        final Node node = new Node(1, new Node(2, new Node(4), new Node(5), null), new Node(3, new Node(6), new Node(7), null), null);

        final sf116 sf116 = new sf116();
        final Node connect = sf116.connect(node);
        System.out.println(connect.toString());


    }

    public Node connect(Node root) {
        connectN(root);
        return root;
    }

    public void connectN(Node root) {

        if(root == null || root.left == null && root.right == null ){
            return;
        }
        root.left.next = root.right;
        if(root.next!= null){
            root.right.next = root.next.left;
        }else {
            root.right.next = null;
        }
        connectN(root.left);
        connectN(root.right);

    }
}
