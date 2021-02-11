package shu;

public class sf117 {


    public static void main(String[] args) {

        final Node node = new Node(2,
                new Node(1,
                        new Node(0,
                                new Node(2),null,null),
                        new Node(7,
                                new Node(1),
                                new Node(0,
                                        new Node(7),null,null),null), null),
                new Node(3,
                        new Node(9),
                        new Node(1,
                                new Node(8),
                                new Node(8),null), null), null);

        final sf117 sf117 = new sf117();
        final Node connect = sf117.connect(node);
        System.out.println(connect.toString());

    }

    public Node connect(Node root) {
        connectN(root);
        return root;
    }



    public void connectN(Node root) {
        if(root == null){
            return;
        }
        if(root.left!=null && root.right !=null){
            root.left.next = root.right;
        }else if(root.left != null){

            Node next = root.next;
            while (next!= null && next.left== null && next.right == null){
                next= next.next;
            }
            if(next!=null && next.left!=null){
                root.left.next = next.left;
            }else if(next!=null){
                root.left.next = next.right;
            }

        }

        if (root.right != null){
            Node next = root.next;
            while (next!= null && next.left== null && next.right == null){
                next= next.next;
            }

            if(next!=null && next.left!=null){
                root.right.next = next.left;
            }else if(next != null){
                root.right.next = next.right;
            }
        }
        //需要先遍历右孩子构建 next指向 再进行构建左孩子
        connectN(root.right);
        connectN(root.left);
    }





}
