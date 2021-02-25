package shu;

public class sf783 {


    /**
     * 给定一个二叉搜索树的根节点 root，返回树中任意两节点的差的最小值。
     * @param args
     */
    public static void main(String[] args) {

        final TreeNode treeNode = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(6));
        final sf783 sf783 = new sf783();
        final int i = sf783.minDiffInBST(treeNode);
        System.out.println(i);
    }

    private TreeNode pre;
    private int max = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {

        if(root== null){
            return max;
        }
        minDiffInBST(root.left);

        if(pre == null){
            pre = root;
        }else {
            max = Math.min(max,root.val-pre.val);
            pre = root;
        }
        minDiffInBST(root.right);

        return max;
    }



}
