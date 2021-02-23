package shu;

import java.util.HashSet;
import java.util.Set;

public class sf653 {


    /**
     * 给定一个二叉搜索树和一个目标结果，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。
     *
     * @param args
     */
    public static void main(String[] args) {

        final TreeNode treeNode = new TreeNode(5, new TreeNode(3, new TreeNode(2), new TreeNode(4)), new TreeNode(6, null, new TreeNode(7)));
        int k = 28;

        final sf653 sf653 = new sf653();
        final boolean target = sf653.findTarget(treeNode, k);
        System.out.println(target);


    }


    /**
     * 使用set 存储当前差值  并查看 当前节点中是否存在其差值
     * @param root
     * @param k
     * @return
     */
    public boolean findTarget(TreeNode root, int k) {

        final Set<Integer> integers = new HashSet<>();
        return findTarget(root,k,integers);
    }

    private boolean findTarget(TreeNode root, int k, Set<Integer> integers) {

        if(root == null){
            return false;
        }
        final int i = k - root.val;
        if(integers.contains(root.val)){
            return true;
        }else {
            integers.add(i);
        }
        return  findTarget(root.left,k,integers) || findTarget(root.right,k,integers);

    }


}
