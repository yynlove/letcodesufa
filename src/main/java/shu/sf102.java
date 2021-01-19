package shu;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class sf102 {


    /**
     * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
     * @param args
     */
    public static void main(String[] args) {
        final sf102 sf102 = new sf102();
        final TreeNode treeNode = new TreeNode(1, null,new TreeNode(2,new TreeNode(4),new TreeNode(3)));
        final List<List<Integer>> lists = sf102.levelOrder(treeNode);
        System.out.println(lists.toString());

    }



    public List<List<Integer>> levelOrder(TreeNode root) {
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
        return arrayLists;


    }

}
