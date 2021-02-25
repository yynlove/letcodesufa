package shu;

public class sf687 {


    /**
     * 给定一个二叉树，找到最长的路径，这个路径中的每个节点具有相同值。 这条路径可以经过也可以不经过根节点。
     *
     * 注意：两个节点之间的路径长度由它们之间的边数表示。
     * @param args
     */
    public static void main(String[] args) {

        final TreeNode treeNode = new TreeNode(5, new TreeNode(4, new TreeNode(1), new TreeNode(1)), new TreeNode(5, null, new TreeNode(5)));
        final sf687 sf687 = new sf687();
        final int i = sf687.longestUnivaluePath(treeNode);
        System.out.println(i);
    }


    int length = 0;

    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return length;
    }

    private int dfs(TreeNode root) {

        if(root == null){
            return 0;
        }

        final int l = dfs(root.left);
        final int r = dfs(root.right);
        int arrowLeft = 0, arrowRight = 0;
        if(root.left != null && root.left.val == root.val){
            arrowLeft = l + 1;
        }

        if(root.right != null && root.right.val == root.val){
            arrowRight = r + 1;
        }

        length = Math.max(length,arrowLeft+arrowRight);
        return Math.max(arrowLeft,arrowRight);

    }


}
