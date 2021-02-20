package shu;

import java.util.Map;

public class sf530 {


    /**
     * 给你一棵所有节点为非负值的二叉搜索树，请你计算树中任意两节点的差的绝对值的最小值。
     * 中序遍历  两两相邻值最小值 便是
     * @param args
     */
    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode(1, null, new TreeNode(3, new TreeNode(2), null));
        sf530 sf530 = new sf530();
        int minimumDifference = sf530.getMinimumDifference(treeNode);
        System.out.println(minimumDifference);

    }


    private int min = Integer.MAX_VALUE;
    private int pre = -1;

    public int getMinimumDifference(TreeNode root) {
        getValue(root);
        return min;
    }


    private void getValue(TreeNode root) {

        if(root == null){
            return;
        }

        getValue(root.left);
        if (pre >= 0) {
            int abs = Math.abs(root.val - pre);
            min = Math.min(abs,min);
        }
        pre = root.val;
        getValue(root.right);

    }


}
