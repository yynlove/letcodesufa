package shu;

public class sf701 {


    /**
     * 给定二叉搜索树（BST）的根节点和要插入树中的值，将值插入二叉搜索树。 返回插入后二叉搜索树的根节点。 输入数据 保证 ，新值和原始二叉搜索树中的任意节点值都不同。
     *
     * 注意，可能存在多种有效的插入方式，只要树在插入后仍保持为二叉搜索树即可。 你可以返回 任意有效的结果 。
     * @param args
     */
    public static void main(String[] args) {

        final TreeNode treeNode = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7));
        final sf701 sf701 = new sf701();
        int k = 5;
        final TreeNode treeNode1 = sf701.insertIntoBST(treeNode, k);
        System.out.println(treeNode1);

    }


    public TreeNode insertIntoBST(TreeNode root, int val) {

        if(root ==null){
            return new TreeNode(val);
        }

        if(val < root.val){
            root.left = insertIntoBST(root.left,val);
        }else {
            root.right = insertIntoBST(root.right,val);
        }
        return root;
    }

}
