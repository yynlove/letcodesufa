package shu;

public class sf101 {

    /**
     * 给定一个二叉树，检查它是否是镜像对称的。
     * @param args
     */
    public static void main(String[] args) {

        final sf101 sf101 = new sf101();
        final TreeNode treeNode = new TreeNode(1, new TreeNode(2,new TreeNode(3),new TreeNode(4)),new TreeNode(2,new TreeNode(4),new TreeNode(3)));
        final boolean symmetric = sf101.isSymmetric(treeNode);
        System.out.println(symmetric);

    }


    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return isLeftAndRight(root.left, root.right);
    }

    public boolean isLeftAndRight(TreeNode l,TreeNode r){

        if(l== null && r == null){
            return true;
        }else if(l!=null && r == null){
            return false;
        }else if(l == null){
            return false;
        }else if(l.val != r.val){
            return false;
        }else{
            return isLeftAndRight(l.left,r.right) && isLeftAndRight(l.right,r.left);
        }
    }

}
