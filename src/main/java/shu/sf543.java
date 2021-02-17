package shu;

public class sf543 {

    /**
     * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
     * @param args
     */
    public static void main(String[] args) {

        //TreeNode treeNode = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3));
        TreeNode treeNode = new TreeNode(1);
        sf543 sf543 = new sf543();
        int i = sf543.diameterOfBinaryTree(treeNode);
        System.out.println(i);
    }


    private int max =0;
    public int diameterOfBinaryTree(TreeNode root) {
       dTree(root);
        return max;
    }

    private int dTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int i1=0;
        if(root.left!=null){
            i1 = dTree(root.left);
            i1++;
        }
        int i2=0;
        if(root.right!=null){
            i2 = dTree(root.right);
            i2++;
        }
        max = Math.max(max,i1+i2);
        return Math.max(i1,i2);
    }


}
