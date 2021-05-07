package shu;

public class sf938 {

    /**
     * 给定二叉搜索树的根结点 root，返回值位于范围 [low, high] 之间的所有结点的值的和。
     *
     * @param args
     */
    public static void main(String[] args) {

        final sf938 sf938 = new sf938();

        final TreeNode treeNode = new TreeNode(10, new TreeNode(5, new TreeNode(3), new TreeNode(7)), new TreeNode(15, null, new TreeNode(18)));

        final int i = sf938.rangeSumBST(treeNode, 6, 15);
        System.out.println(i);
    }




    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null){
            return 0;
        }
        if(root.val >= low && root.val <= high){
            return root.val + rangeSumBST(root.right,low,high) + rangeSumBST(root.left,low,high);
        }else if(root.val <low){
            return rangeSumBST(root.right,low,high);
        }else{
            return rangeSumBST(root.left,low,high);
        }
    }



}
