package shu;

public class sf617 {


    /**
     * 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
     *
     * 你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/merge-two-binary-trees
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */
    public static void main(String[] args) {

        final TreeNode root1 = new TreeNode(1, new TreeNode(3, new TreeNode(5), null), new TreeNode(2));
        final TreeNode root2 = new TreeNode(2, new TreeNode(1, null, new TreeNode(4)), new TreeNode(3, null, new TreeNode(7)));

        final sf617 sf617 = new sf617();
        final TreeNode treeNode = sf617.mergeTrees(root1, root2);
        System.out.println(treeNode);

    }



    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null){
            return null;
        }
        final TreeNode treeNode = new TreeNode();
        mergeTreesZ(root1,root2,treeNode);
        return treeNode;
    }

    private void mergeTreesZ(TreeNode root1, TreeNode root2, TreeNode treeNode) {
        if(root1== null && root2 == null){
            return;
        }
        treeNode.val = ((root1!= null)? root1.val : 0) + ((root2 != null)? root2.val : 0);
        if ((root1 == null || root1.left == null) && (root2 == null || root2.left == null)) {
            treeNode.left = null;
        } else {
            final TreeNode treeNode1 = new TreeNode();
            final TreeNode treeNode2 = (root1 != null) ? root1.left : null;
            final TreeNode treeNode3 = (root2 != null) ? root2.left : null;
            mergeTreesZ(treeNode2,treeNode3,treeNode1);
            treeNode.left = treeNode1;
        }

        if((root1== null || root1.right == null) && (root2 ==null || root2.right == null)){
            treeNode.right = null;
        }else {
            final TreeNode treeNode1 = new TreeNode();
            final TreeNode treeNode2 = (root1 != null) ? root1.right : null;
            final TreeNode treeNode3 = (root2 != null) ? root2.right : null;
            mergeTreesZ(treeNode2,treeNode3,treeNode1);
            treeNode.right = treeNode1;
        }

    }


}
