package shu;

public class sf108 {

    /**
     *     将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
     *     一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
     * @param args
     */
    public static void main(String[] args) {

        int[] nums = {-10,-3,0,5,9};
        final sf108 sf108 = new sf108();
        final TreeNode treeNode = sf108.sortedArrayToBST(nums);
        System.out.println(treeNode);
    }





    public TreeNode sortedArrayToBST(int[] nums) {

        final TreeNode treeNode = absTn(nums, 0, nums.length - 1);
        return treeNode;
    }

    private TreeNode absTn(int[] nums, int is, int ie) {
        if(is>ie){
            return null;
        }
        final int i = ie - is;
        final int zws = (int) Math.floor(i / 2);
        final TreeNode treeNode = new TreeNode(nums[is+zws]);
        treeNode.left = absTn(nums,is,is+zws-1);
        treeNode.right = absTn(nums,is+zws+1,ie);
        return treeNode;
    }


}
