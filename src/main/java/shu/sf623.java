package shu;

public class sf623 {


    /**
     * 给定一个二叉树，根节点为第1层，深度为 1。在其第 d 层追加一行值为 v 的节点。
     *
     * 添加规则：给定一个深度值 d （正整数），针对深度为 d-1 层的每一非空节点 N，为 N 创建两个值为 v 的左子树和右子树。
     *
     * 将 N 原先的左子树，连接为新节点 v 的左子树；将 N 原先的右子树，连接为新节点 v 的右子树。
     *
     * 如果 d 的值为 1，深度 d - 1 不存在，则创建一个新的根节点 v，原先的整棵树将作为 v 的左子树。
     * @param args
     */
    public static void main(String[] args) {

        final TreeNode treeNode = new TreeNode(4, new TreeNode(2,new TreeNode(3),new TreeNode(1)),null);
        final sf623 sf623 = new sf623();
        int v = 1;
        int d = 3;
        final TreeNode treeNode1 = sf623.addOneRow(treeNode,v,d);
        System.out.println(treeNode1);

    }



    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if(d == 1){
            return new TreeNode(v,root,null);
        }
        int curIndex =1;
        addOneRow(root,curIndex,v,d);
        return root;

    }

    private void addOneRow(TreeNode root, int curIndex, int v, int d) {
        if(root == null) {
            return;
        }
        if(curIndex == d-1){
            final TreeNode sLeft = root.left;
            final TreeNode sRight = root.right;
            root.left = new TreeNode(v,sLeft,null);
            root.right = new TreeNode(v,null,sRight);
            return;
        }
        curIndex ++;
        addOneRow(root.left,curIndex,v,d);
        addOneRow(root.right,curIndex,v,d);
    }


}
