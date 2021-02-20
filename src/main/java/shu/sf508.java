package shu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class sf508 {

    /**
     * 给你一个二叉树的根结点，请你找出出现次数最多的子树元素和。一个结点的「子树元素和」定义为以该结点为根的二叉树上所有结点的元素之和（包括结点本身）。
     * @param args
     */
    public static void main(String[] args) {

        sf508 sf508 = new sf508();
        TreeNode treeNode = new TreeNode(5, new TreeNode(2), new TreeNode(-5));
        int[] frequentTreeSum = sf508.findFrequentTreeSum(treeNode);
        Arrays.stream(frequentTreeSum).forEach(System.out::println);

    }



    public int[] findFrequentTreeSum(TreeNode root) {

        if(root == null){
            return new int[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        findChildren(root,map);

        Integer integer = map.values().stream().max(Integer::compareTo).get();
        int[] ints = map.keySet().stream().filter(key -> map.get(key) == integer).mapToInt(Integer::intValue).toArray();
        return ints;
    }

    private int findChildren(TreeNode root, Map<Integer, Integer> map) {

        if(root == null){
            return 0;
        }

        int left = findChildren(root.left, map);
        int right = findChildren(root.right, map);

        int i = left + right + root.val;
        if(map.containsKey(i)){
            Integer integer = map.get(i);
            map.put(i,integer+1);
        }else {
            map.put(i,1);
        }
        return i;
    }


}
