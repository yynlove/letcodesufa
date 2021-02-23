package shu;

public class sf654 {


    /**
     *
     * 最大二叉树
     * 给定一个不含重复元素的整数数组 nums 。一个以此数组直接递归构建的 最大二叉树 定义如下：
     *
     *     二叉树的根是数组 nums 中的最大元素。
     *     左子树是通过数组中 最大值左边部分 递归构造出的最大二叉树。
     *     右子树是通过数组中 最大值右边部分 递归构造出的最大二叉树。
     *
     * 返回有给定数组 nums 构建的 最大二叉树 。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/maximum-binary-tree
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */
    public static void main(String[] args) {

            //final TreeNode treeNode = new TreeNode(6, new TreeNode(3, null, new TreeNode(2, null, new TreeNode(1))), new TreeNode(5, new TreeNode(0), null));
            int[] nums = {3,2,1,6,0,5};
            final sf654 sf654 = new sf654();
            final TreeNode treeNode = sf654.constructMaximumBinaryTree(nums);
            System.out.println(treeNode);

    }


    /**
     * 遍历通过指定数组范围的起止位置，求出最大值的索引位置
     * @param nums
     * @return
     */
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int startIndex =0;
        int endIndex = nums.length-1;
        final int index = getIndex(nums,startIndex,endIndex);

        final TreeNode treeNode = new TreeNode(nums[index]);
        treeNode.left = setChildren(nums,0,index-1);
        treeNode.right = setChildren(nums,index+1,endIndex);

        return treeNode;

    }

    private TreeNode setChildren(int[] nums, int startIndex, int endIndex) {
        if(startIndex>endIndex){
            return null;
        }
        final int index = getIndex(nums, startIndex, endIndex);
        final TreeNode treeNode = new TreeNode(nums[index]);
        treeNode.left = setChildren(nums,startIndex,index-1);
        treeNode.right = setChildren(nums,index+1,endIndex);
        return treeNode;
    }


    public int  getIndex(int[] nums,int startIndex,int endIndex){
        int max =  Integer.MIN_VALUE;
        int index = -1;
        for (int i = startIndex;i<= endIndex;i++){
            if(max < nums[i]){
                max = nums[i];
                index = i;
            }
        }
        return index;
    }

















}
