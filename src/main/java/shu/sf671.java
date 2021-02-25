package shu;

public class sf671 {


    /**
     * 给定一个非空特殊的二叉树，每个节点都是正数，并且每个节点的子节点数量只能为 2 或 0。如果一个节点有两个子节点的话，那么该节点的值等于两个子节点中较小的一个。
     *
     * 更正式地说，root.val = min(root.left.val, root.right.val) 总成立。
     *
     * 给出这样的一个二叉树，你需要输出所有节点中的第二小的值。如果第二小的值不存在的话，输出 -1 。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/second-minimum-node-in-a-binary-tree
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */
    public static void main(String[] args) {
        final sf671 sf671 = new sf671();
        final TreeNode treeNode = new TreeNode(5, new TreeNode(8), new TreeNode(5));
        final int secondMinimumValue = sf671.findSecondMinimumValue(treeNode);
        System.out.println(secondMinimumValue);
    }




    public int findSecondMinimumValue(TreeNode root) {
        return dfs(root, root.val);
    }

    private int dfs(TreeNode root,int value) {
        if(root == null){
            return -1;
        }
        //如果有一个节点的值大于根节点，则 则这个节点的值 是以这个节点为根的子树的上的最小值
        if(root.val > value){
            return root.val;
        }

        final int l = dfs(root.left, value);
        final int f = dfs(root.right, value);
        //由于根节点 一定是最小值，所以分别求左右子树中 分别大于根节点 的最小值 ，其中有一个值必定是第二小的值。
        if(l > value && f > value){
            return Math.min(l,f);
        }

        return Math.max(l,f);

    }


}
