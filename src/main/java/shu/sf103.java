package shu;

import java.util.*;

public class sf103 {


    /**
     *     给定一个二叉树，返回其节点值的锯齿形层序遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
     * @param args
     */
    public static void main(String[] args) {
        final sf103 sf103 = new sf103();
        final TreeNode treeNode = new TreeNode(1, null,new TreeNode(2,new TreeNode(4),new TreeNode(3)));
        final List<List<Integer>> lists = sf103.zigzagLevelOrder(treeNode);
        System.out.println(lists.toString());
    }




    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        final List<List<Integer>> arrayLists = new ArrayList<>();
        if(root == null){
            return arrayLists;
        }
        final Queue<TreeNode> treeNodes = new ArrayDeque<>();

        treeNodes.add(root);
        int everySum =1;
        int cs=0;
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
            if(cs%2 !=0){
                Collections.reverse(integers);
            }
            arrayLists.add(integers);
            cs++;
        }
        return arrayLists;
    }


}
