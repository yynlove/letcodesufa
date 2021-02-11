package shu;

public class sf111 {

    /**
     * 给定一个二叉树，找出其最小深度。
     * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
     * 输入：root = [3,9,20,null,null,15,7]
     * 输出：2
     * @param args
     */
    public static void main(String[] args) {
        final sf111 sf111 = new sf111();
       // final TreeNode treeNode = new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7)));
        final TreeNode treeNode = new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null, new TreeNode(6))));
        final int i = sf111.minDepth(treeNode);
        System.out.println(i);
    }

    public int minDepth(TreeNode root) {
        if(root== null){
            return 0;
        }
        final int rh = minDepth(root.right);
        final int rl = minDepth(root.left);
        if(rh>0 && rl>0){
            return Math.min(rh, rl)+1;
        }else {
            return Math.max(rh,rl)+1;
        }


    }

}
