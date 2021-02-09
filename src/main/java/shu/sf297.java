package shu;

import java.util.*;

import java.util.stream.Collectors;

public class sf297 {


    public static void main(String[] args) {

        final TreeNode treeNode = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
        final sf297 sf297 = new sf297();
        final String serialize = sf297.serialize(null);
        System.out.println(serialize);

        final TreeNode deserialize = sf297.deserialize(serialize);
        System.out.println(deserialize);
    }


    /**
     *  Encodes a tree to a single string.
     * @param root
     * @return
     */
    public String serialize(TreeNode root) {
        if(root == null){
            return "[]";
        }
        final List<String> integers = new ArrayList<>();
        Queue<TreeNode> queue =  new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            final TreeNode poll = queue.poll();
            if(poll == null){
                integers.add(null);
            }else {
                integers.add(String.valueOf(poll.val));
                queue.offer(poll.left);
                queue.offer(poll.right);
            }
        }
        final String collect = integers.stream().collect(Collectors.joining(",", "[", "]"));
        return collect;

    }



    /**
     * Decodes your encoded data to tree.
     * @param data
     * @return
     */
    public TreeNode deserialize(String data) {

        final String[] split = data.substring(1, data.length() - 1).split(",");
        //如果是”“ 则为空数组
        if(split[0].isEmpty() && split.length == 1){
            return null;
        }

        final TreeNode root = new TreeNode();
        final Queue<String> qu = new LinkedList<>();
        for (String s : split) {
            qu.offer(s);
        }

        root.val = Integer.parseInt(qu.poll());
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty() && !qu.isEmpty()){
            final TreeNode poll = queue.poll();
            final String left = qu.poll();
            if(!Objects.equals(left, "null")){
                final TreeNode treeNode = new TreeNode(Integer.parseInt(left));
                queue.offer(treeNode);
                poll.left = treeNode;
            }
            final String right = qu.poll();
            if(!Objects.equals(right,"null")){
                final TreeNode treeNode = new TreeNode(Integer.parseInt(right));
                queue.offer(treeNode);
                poll.right = treeNode;
            }
        }

        return root;
    }

}
