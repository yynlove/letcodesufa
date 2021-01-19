package shu;

public class sf104 {

    /**
     * 给定一个二叉树，找出其最大深度。
     * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
     * @param args
     */
    public static void main(String[] args) {

        final sf104 sf104 = new sf104();
        final TreeNode treeNode = new TreeNode(1, null,new TreeNode(2,new TreeNode(4),new TreeNode(3)));
        final int i = sf104.maxDepth(treeNode);
        System.out.println(i);
    }


    /**
     * 最大深度
     * @param root
     * @return
     */

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }else{
            return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
        }
    }



}
