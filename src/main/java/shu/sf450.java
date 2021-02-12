package shu;

public class sf450 {


    /**
     * 给定一个二叉搜索树的根节点 root 和一个值 key，删除二叉搜索树中的 key 对应的节点，并保证二叉搜索树的性质不变。返回二叉搜索树（有可能被更新）的根节点的引用。
     *
     * 一般来说，删除节点可分为两个步骤：
     *
     *     首先找到需要删除的节点；
     *     如果找到了，删除它。
     *
     * 说明： 要求算法时间复杂度为 O(h)，h 为树的高度。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/delete-node-in-a-bst
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */
    public static void main(String[] args) {


        TreeNode treeNode = new TreeNode(5, new TreeNode(3, null, new TreeNode(4)), new TreeNode(7, new TreeNode(6), new TreeNode(8)));

        sf450 sf450 = new sf450();
        TreeNode treeNode1 = sf450.deleteNode(treeNode, 4);
        System.out.println(treeNode1);

    }



    public TreeNode deleteNode(TreeNode root, int key) {

        if(root == null){
            return null;
        } else if(root.val == key){
            if(root.right == null){
                root = root.left;
            }else if(root.left == null){
                root = root.right;
            }else {
                TreeNode nr = root.right;
                while (nr.left != null){
                    nr = nr.left;
                }
                //获得最小值时，将其最小值从子树中除去
                TreeNode treeNode = deleteNode(root.right, nr.val);
                //除去之后 在进行赋值
                nr.left = root.left;
                nr.right = treeNode;
                return nr;
            }
        }else if(root.val > key){
            root.left = deleteNode(root.left, key);
        }else {
            root.right = deleteNode(root.right, key);
        }
        return root;
    }

    private TreeNode getRightMin(TreeNode right,TreeNode root) {
        TreeNode r = right;
        while (r.left!=null){
          r = r.left;
        }
        r.left = root.left;
        r.right = root.right;
        return r;
    }


}
