package shu;

public class sf235 {


    public static void main(String[] args) {
        final TreeNode treeNode = new TreeNode(6, new TreeNode(2, new TreeNode(0), new TreeNode(4, new TreeNode(3), new TreeNode(5))), new TreeNode(8, new TreeNode(7), new TreeNode(9)));



        final sf235 sf235 = new sf235();

        final TreeNode p = new TreeNode(2);
        final TreeNode q = new TreeNode(4);

        final TreeNode treeNode1 = sf235.lowestCommonAncestor(treeNode, p, q);
        System.out.println(treeNode1.val);
    }


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }
        if(root.val>= Math.min(p.val, q.val) && root.val <= Math.max(p.val,q.val)){
            return root;
        }else if(root.val >= Math.min(p.val, q.val)){
            return lowestCommonAncestor(root.left,p,q);
        }else {
            return lowestCommonAncestor(root.right, p, q);
        }
    }


}
