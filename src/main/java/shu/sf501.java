package shu;

import java.util.*;
import java.util.stream.Collectors;

public class sf501 {


    public static void main(String[] args) {

        sf501 sf501 = new sf501();
        TreeNode treeNode = new TreeNode(1, null, new TreeNode(2, new TreeNode(2), null));
        int[] mode = sf501.findMode(null);
        Arrays.stream(mode).forEach(System.out::println);

    }


    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> mode = findMode(root, map);
        if(mode.size() ==0){
            return new int[0];
        }
        Integer integer = mode.values().stream().max(Integer::compareTo).orElseGet(null);
        int[] ints = mode.keySet().stream().filter(key -> mode.get(key).intValue() == integer).mapToInt(Integer::intValue).toArray();
        return ints;

    }

    private Map<Integer, Integer> findMode(TreeNode root, Map<Integer,Integer> map) {
        if(root == null){
            return map;
        }
        if(map.containsKey(root.val)){
            int i = map.get(root.val) + 1;
            map.put(root.val, i);
        }else {
            map.put(root.val, 1);
        }

        Map<Integer, Integer> mode = findMode(root.left, map);
        Map<Integer, Integer> mode1 = findMode(root.right, mode);
        return mode1;


    }


}
