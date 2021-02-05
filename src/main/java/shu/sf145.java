package shu;

import java.util.ArrayList;
import java.util.List;

public class sf145 {


    /**
     * 给定一个二叉树，返回它的 后序 遍历。
     * @param args
     */
    public static void main(String[] args) {

        final TreeNode treeNode = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        final sf145 sf145 = new sf145();
        final List<Integer> integers = sf145.postorderTraversal(treeNode);
        System.out.println(integers.toString());

    }



    public List<Integer> postorderTraversal(TreeNode root) {
      return  postorderTraversal(root,new ArrayList<Integer>());
    }

    private List<Integer> postorderTraversal(TreeNode root, List<Integer> list) {

        if(root == null){
            return list;
        }

        final List<Integer> integers = postorderTraversal(root.left, list);
        final List<Integer> integers1 = postorderTraversal(root.right, integers);
        integers1.add(root.val);
        return integers1;
    }


}
