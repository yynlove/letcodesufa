package shu;

public class sf129 {

    /**
     * 给定一个二叉树，它的每个结点都存放一个 0-9 的数字，每条从根到叶子节点的路径都代表一个数字。
     *
     * 例如，从根到叶子节点路径 1->2->3 代表数字 123。
     *
     * 计算从根到叶子节点生成的所有数字之和。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/sum-root-to-leaf-numbers
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */

    public int sum = 0;
    public static void main(String[] args) {

        final sf129 sf129 = new sf129();
        final TreeNode treeNode = new TreeNode(4, new TreeNode(9,new TreeNode(5),new TreeNode(1)), new TreeNode(0));
        sf129.sumNumbers(treeNode);
        System.out.println(sf129.sum);

    }


    public int sumNumbers(TreeNode root) {

        sumNumbers(root,0);
        return  sum;
    }

    /**
     * 使用全局变量
     * @param root
     * @param cSum
     */
    private void sumNumbers(TreeNode root ,int cSum) {
        if(root == null){
            return;
        }else if(root.left == null && root.right == null){
            sum =sum + root.val + 10*cSum;
            return;
        }else {
            cSum = root.val + cSum* 10;
            sumNumbers(root.left,cSum);
            sumNumbers(root.right,cSum);
        }

    }

}
