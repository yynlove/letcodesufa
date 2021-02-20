package shu;

import java.util.*;

public class sf429 {

    /**
     *  给定一个 N 叉树，返回其节点值的层序遍历。（即从左到右，逐层遍历）。
     *
     * 树的序列化输入是用层序遍历，每组子节点都由 null 值分隔（参见示例）。
     * @param args
     */
    public static void main(String[] args) {

        final ArrayList<dNode> dNodes = new ArrayList<>();
        final List<dNode> dNodes1 = new ArrayList<>();
        dNodes1.add(new dNode(5));
        dNodes1.add(new dNode(6));

        dNodes.add(new dNode(3, dNodes1));
        dNodes.add(new dNode(2));
        dNodes.add(new dNode(4));

        final dNode dNode = new dNode(1, dNodes);
        final sf429 sf429 = new sf429();

        final List<List<Integer>> lists = sf429.levelOrder(dNode);
        System.out.println(lists.toString());
    }



    public List<List<Integer>> levelOrder(dNode root) {

        List<List<Integer>> lists = new ArrayList<>();
        //判断是否null
        if(root == null){
            return lists;
        }
        //将每一层添加到队列中
        Queue<dNode> queue = new LinkedList<>();
        queue.offer(root);

        ArrayList<Integer> integers = new ArrayList<>();
        Queue<dNode> childrenQueue =new LinkedList<>();
        while (!queue.isEmpty()){

            dNode node = queue.poll();
            if(node != null){
                integers.add(node.val);
            }
            if(node.children != null && node.children.size() != 0){
                childrenQueue.addAll(node.children);
            }
            if(queue.isEmpty()){
                lists.add(integers);
                queue = childrenQueue;
                integers = new ArrayList<>();
                childrenQueue =new LinkedList<>();
            }
        }
        return lists;
    }



}
