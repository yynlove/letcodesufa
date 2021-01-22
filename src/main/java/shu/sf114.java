package shu;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class sf114 {

    /**
     * 给定一个二叉树，原地将它展开为一个单链表。
     * @param args
     */
    public static void main(String[] args) {


        final sf114 sf114 = new sf114();
       // final TreeNode treeNode = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(5, null, new TreeNode(6)));

        sf114.flatten(null);


    }


    public void flatten(TreeNode root) {

        final Queue<Integer> integers = new LinkedList<>();
        final Stack<TreeNode> treeNodes = new Stack<>();
        treeNodes.push(root);
        while(!treeNodes.isEmpty()){
            final TreeNode poll = treeNodes.pop();
            if(poll !=null){
                integers.add(poll.val);
                if(poll.right!= null){
                    treeNodes.push(poll.right);
                }
                if(poll.left != null){
                    treeNodes.push(poll.left);
                }
            }

        }

        while (!integers.isEmpty()){
            if(treeNodes.empty()){
                root.left = null;
                integers.poll();
                treeNodes.push(root);
            }else {
                final TreeNode pop = treeNodes.pop();
                pop.right = new TreeNode(integers.poll());
                treeNodes.push(pop.right);
            }
        }

    }


}
