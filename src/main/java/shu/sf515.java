package shu;

import java.util.ArrayList;
import java.util.List;

public class sf515 {


    /**
     * 您需要在二叉树的每一行中找到最大的值。
     * @param args
     */
    public static void main(String[] args) {
        sf515 sf515 = new sf515();
        TreeNode treeNode = new TreeNode(1, new TreeNode(3, new TreeNode(5), new TreeNode(3)), new TreeNode(2, null, new TreeNode(9)));
        List<Integer> list = sf515.largestValues(treeNode);
        System.out.println(list);
    }


    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }

        findMaxChildren(root,1,list);
        return list;
    }

    private void findMaxChildren(TreeNode root, int i, List<Integer> list) {
        if (root == null){
            return;
        }
        if(list.size()<i){
            list.add(root.val);
        }else if (list.get(i - 1) < root.val) {
            list.set(i - 1, root.val);
        }
        int i1 = i + 1;
        findMaxChildren(root.left,i1,list);
        findMaxChildren(root.right,i1,list);
    }

}
