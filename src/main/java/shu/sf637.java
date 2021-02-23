package shu;

import java.util.*;

public class sf637 {


    /**
     * 给定一个非空二叉树, 返回一个由每层节点平均值组成的数组。
     *
     * 层次遍历
     * @param args
     */
    public static void main(String[] args) {

        final TreeNode treeNode = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        final sf637 sf637 = new sf637();
        final List<Double> doubles = sf637.averageOfLevels(treeNode);
        System.out.println(doubles.toString());
    }



    public List<Double> averageOfLevels(TreeNode root) {
        final List<Double> doubles = new ArrayList<>();
        final Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        while (queue.size() !=0){

            int len = queue.size();
            double sum =0;
            for (int i=0;i<len;i++){
                final TreeNode poll = queue.poll();
                sum += poll.val;
                if(poll.left != null){
                    queue.offer(poll.left);
                }
                if(poll.right != null){
                    queue.offer(poll.right);
                }
            }
            doubles.add(sum/len);
        }
        return doubles;
    }






}
