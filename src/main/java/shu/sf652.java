package shu;

import java.util.*;
import java.util.stream.Collectors;

public class sf652 {


    /**
     * 给定一棵二叉树，返回所有重复的子树。对于同一类的重复子树，你只需要返回其中任意一棵的根结点即可。
     *
     * 两棵树重复是指它们具有相同的结构以及相同的结点值。
     * @param args
     */
    public static void main(String[] args) {
        final TreeNode treeNode = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3, new TreeNode(2, new TreeNode(4), null), new TreeNode(4)));

        //final TreeNode treeNode = new TreeNode(0, new TreeNode(0, new TreeNode(0, new TreeNode(0), new TreeNode(0)), null), new TreeNode(0, null, new TreeNode(0, new TreeNode(0), new TreeNode(0))));
        final sf652 sf652 = new sf652();
        final List<TreeNode> duplicateSubtrees = sf652.findDuplicateSubtrees(treeNode);
        System.out.println(duplicateSubtrees.toString());
    }


    /**
     * 通过序列化 和反序列化来实现
     * @param root
     * @return
     */
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {

        final Map<String, Integer> map = new HashMap<>();
        tNCurrentStr(root, map);
        final List<TreeNode> collect = map.keySet().stream().filter(key -> map.get(key) > 1).map(key -> strCurrentTn(key)).collect(Collectors.toList());
        return collect;


    }

    /**
     * 字符串序列化成树
     * @param str
     * @return
     */
    private TreeNode strCurrentTn(String str) {

        final String[] split = str.split("#");
        final List<String> strings = Arrays.asList(split);
        final Queue<String> queue = new LinkedList<>(strings);
        final String poll = queue.poll();
        final TreeNode treeNode = new TreeNode(Integer.parseInt(poll));
        queueToObj(treeNode,queue);
        return treeNode;
    }

    /**
     * 填充树节点
     * @param root
     * @param queue
     */
    private void queueToObj(TreeNode root, Queue<String> queue) {

        final String poll = queue.poll();
        if(!Objects.equals(poll,"null")){
            final TreeNode treeNode = new TreeNode(Integer.parseInt(poll));
            root.left = treeNode;
            queueToObj(treeNode,queue);
        }
        final String poll1 = queue.poll();
        if(!Objects.equals(poll1,"null")){
            final TreeNode treeNode1 = new TreeNode(Integer.parseInt(poll1));
            root.right= treeNode1;
            queueToObj(treeNode1,queue);

        }
    }

    /**
     * 树序列化成字符串
     * @param root
     * @param map
     * @return
     */
    private String tNCurrentStr(TreeNode root, Map<String, Integer> map) {

        if(root == null){
            return "null";
        }
        final String leftStr = tNCurrentStr(root.left, map);
        final String rightStr = tNCurrentStr(root.right, map);

        String key = root.val+"#"+leftStr+"#"+rightStr;
        if(map.containsKey(key)){
            map.put(key, map.get(key) +1);
        }else {
            map.put(key,1);
        }
        return key;
    }

}
