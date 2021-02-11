package shu;

public class sf404 {


    /**
     * 计算给定二叉树的所有左叶子之和。
     * @param args
     */
    public static void main(String[] args) {

        final TreeNode treeNode = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
      //  final TreeNode treeNode = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3));
        final sf404 sf404 = new sf404();
        final int i = sf404.sumOfLeftLeaves(treeNode);
        System.out.println(i);

    }

    public int sumOfLeftLeaves(TreeNode root) {
        return  sumOfLeftLeaves(root, 0);
    }

    public int sumOfLeftLeaves(TreeNode root,int sum) {

        if(root == null){
            return sum;
        }
        if(root.left!= null && root.left.left == null && root.left.right == null){
            sum = sum + root.left.val;
        }
        final int i = sumOfLeftLeaves(root.left, sum);
        final int i1 = sumOfLeftLeaves(root.right, i);

        return i1;
    }

}
