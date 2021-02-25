package shu;

public class sf700 {


    public static void main(String[] args) {


        final TreeNode treeNode = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7));

        final sf700 sf700 = new sf700();
        int z = 4;
        final TreeNode treeNode1 = sf700.searchBST(treeNode, z);

        System.out.println(treeNode1);

    }




    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        } else if (root.val == val) {
            return root;
        } else if (root.val > val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }
}
