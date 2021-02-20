package shu;

public class sf572 {


    /**
     * 给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/subtree-of-another-tree
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */
    public static void main(String[] args) {
//        final TreeNode s = new TreeNode(3, new TreeNode(4,new TreeNode(1),null), new TreeNode(5,new TreeNode(2),null));
//        final TreeNode t = new TreeNode(3, new TreeNode(4), new TreeNode(5));
        final TreeNode s = new TreeNode(1, new TreeNode(1), null);
        final TreeNode t = new TreeNode(1);

        final sf572 sf572 = new sf572();
        final boolean subtree = sf572.isSubtree(s, t);
        System.out.println(subtree);

    }



    public boolean isSubtree(TreeNode s, TreeNode t) {

        if(s == t && t == null){
            return true;
        }else if(s == null || t== null){
            return false;
        }else {
            return isSametree(s,t) || isSubtree(s.left,t) || isSubtree(s.right,t);
        }

    }

    private boolean isSametree(TreeNode s, TreeNode t) {
        if(s == null && t == null){
            return true;
        }else if(s == null || t== null){
            return false;
        }else {
            return (s.val == t.val && isSametree(s.left,t.left) && isSametree(s.right,t.right));
        }
    }


}
