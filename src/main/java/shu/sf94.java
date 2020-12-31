package shu;

import java.util.ArrayList;
import java.util.List;

public class sf94 {


    public static void main(String[] args) {

        //root = {1,null,2,3};
        final sf94 sf94 = new sf94();
        final TreeNode treeNode = new TreeNode(1, null, new TreeNode(2, new TreeNode(3),null));
        final List<Integer> integers = sf94.inorderTraversal(treeNode);
        System.out.println(integers.toString());

    }

    /**
     * 给定一个二叉树的根节点 root ，返回它的 中序 遍历。       中序-》前中后
     *
     *除此之外 也可用基于栈的 左入栈
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {

        final ArrayList<Integer> integers = new ArrayList<Integer>();
        if(root==null){
            return integers;
        }
        if(root.left!=null){
            final List<Integer> integers1 = inorderTraversal(root.left);
            integers.addAll(integers1);
        }
        integers.add(root.val);
        if(root.right != null){
            final List<Integer> integers1 = inorderTraversal(root.right);
            integers.addAll(integers1);;
        }

        return integers;
    }


}
