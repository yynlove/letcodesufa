package shu;

public class sf112 {


    /**
     * 给你二叉树的根节点 root 和一个表示目标和的整数 targetSum ，判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和 targetSum 。
     *
     *  输入：root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
     * 输出：true
     * @param args
     */
    public static void main(String[] args) {

        final sf112 sf112 = new sf112();
        //final TreeNode treeNode = new TreeNode(5, new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null), new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));

        final TreeNode treeNode = new TreeNode(1, null, new TreeNode(3));
        int tatgetSum = 4;

        final boolean b = sf112.hasPathSum(treeNode, tatgetSum);
        System.out.println(b);
    }


    public boolean hasPathSum(TreeNode root, int targetSum) {

        if(root == null){
            return 0 == targetSum;
        }else if(root.left != null && root.right!= null){
            return  hasPathSum(root.right,targetSum-root.val) || hasPathSum(root.left,targetSum-root.val);
        }else if(root.left != null){
            return hasPathSum(root.left,targetSum-root.val);
        }else if(root.right != null){
            return hasPathSum(root.right,targetSum-root.val);
        }else{
           return  root.val == targetSum;
        }
    }

}

