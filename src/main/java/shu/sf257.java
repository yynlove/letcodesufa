package shu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class sf257 {


    /**
     * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
     * @param args
     */
    public static void main(String[] args) {

        //final TreeNode treeNode = new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3));

        final TreeNode treeNode = new TreeNode(1, new TreeNode(2), new TreeNode(3, null, new TreeNode(5)));
        final sf257 sf257 = new sf257();
        final List<String> strings = sf257.binaryTreePaths(treeNode);
        System.out.println(strings.toString());

    }

    /**
     * 第一种
     * @param root
     * @return
     */
    public List<String> binaryTreePaths(TreeNode root) {

        final List<String> arrayLists = new ArrayList<>();

        binaryTreePaths(root, "",arrayLists);
        return arrayLists;

    }

    private void binaryTreePaths(TreeNode root, String cur, List<String> arrayLists) {

        if(root == null){
            return;
        }
        cur = cur+root.val;
        if(root.left == null && root.right == null){
            arrayLists.add(cur);
        }else {
            binaryTreePaths(root.left,cur+"->",arrayLists);
            binaryTreePaths(root.right,cur+"->",arrayLists);

        }
    }

    /**
     * 第二种
     * @param root
     * @return
     */
    public List<String> binaryTreePaths1(TreeNode root) {
        final List<String> arrayLists = new ArrayList<>();
        final ArrayList<String> integers = new ArrayList<>();
        binaryTreePaths1(root, integers,arrayLists);
        return arrayLists;

    }

    private void binaryTreePaths1(TreeNode root, List<String> list, List<String> arrayLists) {

        if(root == null){
            return;
        }

        list.add(String.valueOf(root.val));
        if(root.left == null && root.right == null){
            arrayLists.add(list.stream().collect(Collectors.joining("->")));
            list.remove(list.size()-1);
            return;
        }
        binaryTreePaths1(root.left,list,arrayLists);
        binaryTreePaths1(root.right,list,arrayLists);
        list.remove(list.size()-1);
    }


}
