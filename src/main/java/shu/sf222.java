package shu;

public class sf222 {


    /**
     *给你一棵 完全二叉树 的根节点 root ，求出该树的节点个数。
     * @param args
     */
    public static void main(String[] args) {

        final TreeNode treeNode = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), null));
        final sf222 sf222 = new sf222();
        System.out.println(sf222.countNodes(treeNode));

    }

    public int countNodes(TreeNode root) {
      return countNodes(root,0);
    }


    public int countNodes(TreeNode root,int total) {
        if(root == null){
            return total;
        }
        total= total+1;
        final int i = countNodes(root.left, total);
        return countNodes(root.right,i);
    }

}
