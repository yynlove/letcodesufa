package shu;

public class sf98 {


    public static void main(String[] args) {

        final sf98 sf98 = new sf98();

        final TreeNode treeNode = new TreeNode(5, new TreeNode(4), new TreeNode(6,new TreeNode(6),new TreeNode(7)));

        final boolean validBST = sf98.isValidBST(treeNode);

        System.out.println(validBST);
    }


    /**
     * 给定一个二叉树，判断其是否是一个有效的二叉搜索树
     *
     */

    public boolean isValidBST(TreeNode root) {

        return true;
    }


}
