package shu;

public class sf124 {

    /**
     * 路径 被定义为一条从树中任意节点出发，沿父节点-子节点连接，达到任意节点的序列。该路径 至少包含一个 节点，且不一定经过根节点。
     *
     * 路径和 是路径中各节点值的总和。
     *
     * 给你一个二叉树的根节点 root ，返回其 最大路径和
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/binary-tree-maximum-path-sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */
    public static void main(String[] args) {

        //final TreeNode treeNode = new TreeNode(20, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        final TreeNode treeNode = new TreeNode(2, new TreeNode(-1), null);

        final sf124 sf124 = new sf124();

        final int i = sf124.maxPathSum(treeNode);

        System.out.println(sf124.ret);


    }

    private int ret = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        getMax(root);
        return ret;
    }
    public int getMax(TreeNode root) {
        if(root == null){
            return 0;
        }
        final int leftV = Math.max(0,getMax(root.left));
        final int rightV = Math.max(0,getMax(root.right));
        ret = Math.max(ret,root.val+leftV+rightV);
        return Math.max(leftV, rightV) + root.val;
    }





}
