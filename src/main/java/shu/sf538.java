package shu;

public class sf538 {

    /**
     * 给出二叉 搜索 树的根节点，该树的节点值各不相同，请你将其转换为累加树（Greater Sum Tree），使每个节点 node 的新值等于原树中大于或等于 node.val 的值之和。
     *
     * 提醒一下，二叉搜索树满足下列约束条件：
     *
     *     节点的左子树仅包含键 小于 节点键的节点。
     *     节点的右子树仅包含键 大于 节点键的节点。
     *     左右子树也必须是二叉搜索树。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/convert-bst-to-greater-tree
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */
    public static void main(String[] args) {


        TreeNode treeNode = new TreeNode(4,
                new TreeNode(1, new TreeNode(0), new TreeNode(2, null, new TreeNode(3))),
                new TreeNode(6, new TreeNode(5), new TreeNode(7, null, new TreeNode(8))));
        sf538 sf538 = new sf538();
        TreeNode treeNode1 = sf538.convertBST(treeNode);
        System.out.println(treeNode1);

    }


    public TreeNode convertBST(TreeNode root) {
        sumBsf(root);
        return root;
    }
    private int js =0;
    private void sumBsf(TreeNode root) {

        if(root == null){
            return;
        }
        sumBsf(root.right);
        root.val = js+root.val;
        js = root.val;
        sumBsf(root.left);

    }




}
