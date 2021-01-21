package shu;

import java.util.*;

public class sf107 {


    /**
     * 给定一个二叉树，返回其节点值自底向上的层序遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
     * @param args
     */
    public static void main(String[] args) {

        final sf107 sf107 = new sf107();
        final TreeNode treeNode = new TreeNode(1, null,new TreeNode(2,new TreeNode(4),new TreeNode(3)));
        final List<List<Integer>> lists = sf107.levelOrderBottom(treeNode);
        System.out.println(lists);


    }



    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        final List<List<Integer>> arrayLists = new ArrayList<>();
        if(root == null){
            return arrayLists;
        }
        final Queue<TreeNode> treeNodes = new ArrayDeque<>();

        treeNodes.add(root);
        int everySum =1;
        while (treeNodes.size()!=0){
            final ArrayList<Integer> integers = new ArrayList<>();
            int currentC=0;
            for (int i=0;i<everySum;i++){
                final TreeNode poll = treeNodes.poll();
                integers.add(poll.val);
                if(poll.left !=null){
                    treeNodes.add(poll.left);
                    currentC++;
                }
                if(poll.right!=null){
                    treeNodes.add(poll.right);
                    currentC++;
                }
            }
            everySum = currentC;
            arrayLists.add(integers);
        }
        if(arrayLists != null){
            Collections.reverse(arrayLists);
        }
        return arrayLists;


    }

}
