package shu;

public class sf230 {


    public static void main(String[] args) {

        final TreeNode treeNode = new TreeNode(3, new TreeNode(1, null, new TreeNode(2)), new TreeNode(4));
        final sf230 sf230 = new sf230();
        final int i = sf230.kthSmallest(treeNode,4);
        System.out.println(i);
    }


    /**
     * 第一种思路 遍历寻找
     * @param root
     * @param k
     * @return
     */
    public int kthSmallest1(TreeNode root, int k) {

       bianli(root,k,0);
       return value;

    }

    int value = -1;
    private int  bianli(TreeNode root, int k, int i) {
        int bianliI = i;
        if(root == null){
            return bianliI;
        }
        bianliI = bianli(root.left, k, bianliI);
        bianliI = bianliI+1;
        if(k == bianliI){
            value = root.val;
        }
        return bianli(root.right,k,bianliI);
    }


    /**
     * 第二种思路 遍历左子树 k>左子树就遍历右子树
     * @param root
     * @param k
     * @return
     */
    public int kthSmallest(TreeNode root, int k) {
        int leftN = findChild(root.left);
        if(leftN + 1 == k){
            return root.val;
        }else if(k <= leftN){
            return kthSmallest(root.left,k);
        }else {
            return kthSmallest(root.right,k-leftN-1);
        }
    }
    private int findChild(TreeNode left) {
        if(left == null){
            return 0;
        }
        return findChild(left.left) + findChild(left.right) +1;
    }


}
