package shu;

public class sf224 {


    /**
     *  翻转一棵二叉树。
     * @param args
     */
    public static void main(String[] args) {

        final TreeNode treeNode = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7, new TreeNode(6), new TreeNode(9)));

        final sf224 sf224 = new sf224();

        final TreeNode treeNode1 = sf224.invertTree(treeNode);
        System.out.println(treeNode1);

    }



    public TreeNode invertTree(TreeNode root) {
        invertTreeNo(root);
        return root;
    }



    public void invertTreeNo(TreeNode root) {
        if(root == null){
            return;
        }
        final TreeNode left = root.left;
        root.left = root.right;
        root.right = left;

        invertTreeNo(root.left);
        invertTreeNo(root.right);
    }



}
