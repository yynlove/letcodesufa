package shu;

import java.util.ArrayList;
import java.util.List;

public class sf144 {


    /**
     * 给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
     *
     *
     * @param args
     */
    public static void main(String[] args) {

        final sf144 sf144 = new sf144();
        final TreeNode treeNode = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));

        final List<Integer> integers = sf144.preorderTraversal(treeNode);

        System.out.println(integers.toString());

    }
    public List<Integer> preorderTraversal(TreeNode root){

      return preorderTraversal(root,new ArrayList<>());

    }

    public List<Integer> preorderTraversal(TreeNode root,List<Integer> list) {

        if(root == null){
            return list;
        }
        list.add(root.val);
        final List<Integer> integers = preorderTraversal(root.left, list);
        final List<Integer> integers1 = preorderTraversal(root.right, integers);
        return integers1;
    }


}
