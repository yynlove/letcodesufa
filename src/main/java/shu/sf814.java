package shu;

public class sf814 {


    /**
     * 给定二叉树根结点 root ，此外树的每个结点的值要么是 0，要么是 1。
     *
     * 返回移除了所有不包含 1 的子树的原二叉树。
     * @param args
     */
    public static void main(String[] args) {

        final TreeNode treeNode = new TreeNode(1, new TreeNode(0, new TreeNode(0), new TreeNode(0)), new TreeNode(1, new TreeNode(0), new TreeNode(1)));
        final sf814 sf814 = new sf814();
        final TreeNode treeNode1 = sf814.pruneTree(treeNode);
        System.out.println(treeNode1);
    }


    public TreeNode pruneTree(TreeNode root) {

        if(root == null){
            return null;
        }

        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);

        if(root.val ==0 && root.left == null && root.right == null){
            return null;
        }
        return root;
    }


}
