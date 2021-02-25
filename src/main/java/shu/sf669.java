package shu;

public class sf669 {


    /**
     * 给你二叉搜索树的根节点 root ，同时给定最小边界low 和最大边界 high。通过修剪二叉搜索树，使得所有节点的值在[low, high]中。修剪树不应该改变保留在树中的元素的相对结构（即，如果没有被移除，原有的父代子代关系都应当保留）。 可以证明，存在唯一的答案。
     *
     * 所以结果应当返回修剪好的二叉搜索树的新的根节点。注意，根节点可能会根据给定的边界发生改变。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/trim-a-binary-search-tree
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */
    public static void main(String[] args) {

        //final TreeNode treeNode = new TreeNode(3, new TreeNode(0, null, new TreeNode(2, new TreeNode(1), null)), new TreeNode(4));
        final TreeNode treeNode = new TreeNode(1, new TreeNode(0), new TreeNode(2));
        final sf669 sf669 = new sf669();
        final TreeNode treeNode1 = sf669.trimBST(treeNode, 1, 2);
        System.out.println(treeNode1);
    }


    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root == null){
            return root;
        }

        if(root.val < low){
            return trimBST(root.right,low,high);
        }
        if(root.val > high){
            return trimBST(root.left,low,high);
        }

        root.left = trimBST(root.left,low,high);
        root.right = trimBST(root.right,low,high);
        return root;
    }


}
