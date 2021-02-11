package shu;

import java.util.Stack;

public class sf99 {


    /**
     * 给你二叉搜索树的根节点 root ，该树中的两个节点被错误地交换。请在不改变其结构的情况下，恢复这棵树。
     * @param args
     */
    public static void main(String[] args) {
        final sf99 sf99 = new sf99();
        //final TreeNode treeNode = new TreeNode(3, new TreeNode(1), new TreeNode(4, new TreeNode(2), null));

        final TreeNode treeNode = new TreeNode(4, new TreeNode(5,new TreeNode(1),new TreeNode(3)), new TreeNode(2,new TreeNode(5),new TreeNode(7)));
        sf99.recoverTree(treeNode);
        System.out.println(treeNode);

    }

    private TreeNode t1,t2,pre = null;
    public void recoverTree(TreeNode root) {
        recoverTree1(root);
        final int val = t1.val;
        t1.val = t2.val;
        t2.val = val;
    }

    /**
     * 中序查找
     * @param root
     */
    private void recoverTree1(TreeNode root) {

        if(root == null){
            return;
        }
        recoverTree1(root.left);
        if(pre != null && pre.val > root.val){
            if(t1 == null){
                t1 = pre;
            }
            t2 = root;
        }
        pre = root;
        recoverTree1(root.right);
    }




}
