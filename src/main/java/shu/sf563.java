package shu;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class sf563 {


    /**
     * 给定一个二叉树，计算 整个树 的坡度 。
     *
     * 一个树的 节点的坡度 定义即为，该节点左子树的节点之和和右子树节点之和的 差的绝对值 。如果没有左子树的话，左子树的节点之和为 0 ；没有右子树的话也是一样。空结点的坡度是 0 。
     *
     * 整个树 的坡度就是其所有节点的坡度之和。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/binary-tree-tilt
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */
    public static void main(String[] args) {

        final TreeNode treeNode = new TreeNode(4, new TreeNode(2, new TreeNode(3), new TreeNode(5)), new TreeNode(9, null, new TreeNode(7)));
        final sf563 sf563 = new sf563();
        final int tilt = sf563.findTilt(treeNode);
        System.out.println(tilt);
    }


    public int findTilt(TreeNode root) {
        final List<Integer> integers = new ArrayList<>();
        dfsTreeNode(root, integers);
        final int sum = integers.stream().mapToInt(Integer::intValue).sum();
        return sum;
    }

    private int dfsTreeNode(TreeNode root, List<Integer> integers) {
        if(root == null){
            return 0;
        }

        final int left = dfsTreeNode(root.left, integers);
        final int right = dfsTreeNode(root.right, integers);

        final int abs = Math.abs(left - right);
        integers.add(abs);
        return left+ right+root.val;

    }


}
