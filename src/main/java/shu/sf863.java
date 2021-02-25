package shu;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sf863 {


    /**
     * 给定一个二叉树（具有根结点 root）， 一个目标结点 target ，和一个整数值 K 。
     *
     * 返回到目标结点 target 距离为 K 的所有结点的值的列表。 答案可以以任何顺序返回。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/all-nodes-distance-k-in-binary-tree
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */
    public static void main(String[] args) {

        final TreeNode treeNode = new TreeNode(3, new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4))), new TreeNode(1, new TreeNode(0), new TreeNode(8)));
        final sf863 sf863 = new sf863();
        int target = 5;
        int k = 2;
        final List<Integer> integers = sf863.distanceK(treeNode, treeNode, k);
        System.out.println(integers.toString());
    }



    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        return null;
    }

}
