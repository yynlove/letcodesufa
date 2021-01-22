package shu;

public class sf110 {


    /**
     * 给定一个二叉树，判断它是否是高度平衡的二叉树。
     * 输入：root = [3,9,20,null,null,15,7]
     * 输出：true
     * @param args
     */
    public static void main(String[] args) {
        //[1,2,2,3,null,null,3,4,null,null,4]
        final TreeNode treeNode = new TreeNode(1,new TreeNode(2,new TreeNode(3,new TreeNode(4),null),null),new TreeNode(2,null,new TreeNode(3,null,new TreeNode(4))));
        final sf110 sf109 = new sf110();
        final boolean balanced = sf109.isBalanced(treeNode);
        System.out.println(balanced);
    }



    public boolean isBalanced(TreeNode root) {

        return hc(root)>=0;

    }

    private int hc(TreeNode root) {
        if(root == null){
            return 0;
        }
        int lh= hc(root.left);
        int rh = hc(root.right);
        if(lh<0 || rh<0 || Math.abs(lh-rh)>1){
            return -1;
        }
        return  Math.max(lh,rh)+1;
    }


}
