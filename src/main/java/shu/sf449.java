package shu;

import java.util.*;
import java.util.stream.Collectors;

public class sf449 {

    public static void main(String[] args) {

        //TreeNode treeNode = new TreeNode(4,new TreeNode(2, new TreeNode(1), new TreeNode(3)),new TreeNode(6,new TreeNode(5),null));
        TreeNode treeNode = new TreeNode(1, null, new TreeNode(2));
        sf449 sf449 = new sf449();
        String serialize = sf449.serialize(treeNode);
        System.out.println(serialize);

        TreeNode deserialize = sf449.deserialize(serialize);
        System.out.println(deserialize);

    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> strings = new ArrayList<>();
        if(root!=null){
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()){
                final TreeNode poll = queue.poll();
                if(poll == null){
                    strings.add(null);
                }else {
                    strings.add(String.valueOf(poll.val));
                    queue.offer(poll.left);
                    queue.offer(poll.right);
                }
            }
        }
        String collect = strings.stream().collect(Collectors.joining(",", "[", "]"));
        return collect;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] split = data.substring(1, data.length() - 1).split(",");
        if(split.length ==1 && Objects.equals(split[0],"")){
            return null;
        }

        Queue<String> queue = new LinkedList<>();
        for (int i=0;i<split.length;i++){
            queue.offer(split[i]);
        }

        Queue<TreeNode> qu = new LinkedList<>();
        TreeNode root =new TreeNode(Integer.parseInt(queue.poll())) ;
        qu.offer(root);
        while (!queue.isEmpty()){

            TreeNode gen = qu.poll();
            String leftValue = queue.poll();
            if(!Objects.equals(leftValue,"null")){
                TreeNode left = new TreeNode(Integer.parseInt(leftValue));
                gen.left = left;
                qu.offer(left);
            }
            String rightValue = queue.poll();
            if(!Objects.equals(rightValue,"null")){
                TreeNode right = new TreeNode(Integer.parseInt(rightValue));
                gen.right = right;
                qu.offer(right);
            }
        }
        return root;
    }

}
