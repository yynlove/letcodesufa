package shu;

public class sf100 {


    /**
     * 给定两个二叉树，编写一个函数来检验它们是否相同。
     *
     * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
     * @param args
     */
    public static void main(String[] args) {

        final TreeNode p = new TreeNode(1, new TreeNode(1),new TreeNode(2));
        final TreeNode q = new TreeNode(1, new TreeNode(1),new TreeNode(2));

        final sf100 sf100 = new sf100();
        final boolean sameTree = sf100.isSameTree(p, q);
        System.out.println(sameTree);

    }


    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null && q == null ){
            return true;
        }else if(p!=null && q == null){
            return false;
        }else if(p == null){
            return false;
        }else if(p.val == q.val){
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right) ;
        }else {
            return false;
        }
    }


}
