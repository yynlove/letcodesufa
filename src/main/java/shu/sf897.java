package shu;

public class sf897 {

    public static void main(String[] args) {

        final TreeNode treeNode = new TreeNode(5, new TreeNode(3, new TreeNode(2), new TreeNode(4)), new TreeNode(6));
        final sf897 sf897 = new sf897();
        final TreeNode treeNode1 = sf897.increasingBST(treeNode);
        System.out.println(treeNode1.toString());
    }

    /**
     *
     * @param root
     * @return
     */
    private TreeNode node;
    public TreeNode increasingBST(TreeNode root) {
        if(root == null){
            return null;
        }
        root.right = increasingBST(root.right);
        if(root.left != null){
            TreeNode left = root.left;
            root.left = null;
            node = left;
            while (left.right != null){
                left = left.right;
            }
            left.right = root;
            return increasingBST(node);
        }else {
            return root;
        }

    }


}
