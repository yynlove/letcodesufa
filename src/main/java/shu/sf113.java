package shu;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class sf113 {


    /**
     * 给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。
     *
     * 说明: 叶子节点是指没有子节点的节点。
     *
     * 示例:
     * 给定如下二叉树，以及目标和 sum = 22，

     * @param args
     */
    public List<List<Integer>> result=new ArrayList<>();
    public static void main(String[] args) {

        final TreeNode treeNode = new TreeNode(5, new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null), new TreeNode(8, new TreeNode(13), new TreeNode(4, new TreeNode(5), new TreeNode(1))));

        final sf113 sf113 = new sf113();
        int sum = 22;
        final List<List<Integer>> lists = sf113.pathSum(treeNode, sum);
        System.out.println(lists.toString());
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        final ArrayList<Integer> integers = new ArrayList<>();
        pathSum(root,targetSum,integers);
        return result;
    }


    public void  pathSum(TreeNode root, int targetSum,List<Integer> list) {

        if(root == null){
            return;
        }
        list.add(root.val);
        if(root.left == null && root.right == null && root.val == targetSum){
            result.add(new ArrayList<>(list));
        }
        pathSum(root.left,targetSum- root.val,list);
        pathSum(root.right,targetSum -root.val,list);
        list.remove(list.size()-1);
    }


}
