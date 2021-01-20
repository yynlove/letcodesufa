package shu;

import java.util.ArrayList;
import java.util.List;


public class sf98 {


    public static void main(String[] args) {

        final sf98 sf98 = new sf98();

        final TreeNode treeNode = new TreeNode(5, new TreeNode(1),new TreeNode(4,new TreeNode(3),new TreeNode(6)));

        final boolean validBST = sf98.isValidBST1(treeNode);

        System.out.println(validBST);
    }

    private boolean isValidBST1(TreeNode treeNode) {

        return validate(treeNode, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean validate(TreeNode node, long min, long max) {
        if (node == null) {
            return true;
        }
        if (node.val <= min || node.val >= max) {
            return false;
        }
        return  validate(node.left, min, node.val) && validate(node.right, node.val, max);
    }

    /**
     * 给定一个二叉树，判断其是否是一个有效的二叉搜索树
     *
     */
    public boolean isValidBST(TreeNode root) {


        final ArrayList<Integer> integers = new ArrayList<>();
        final List<Integer> tn = getTn(root, integers);
        System.out.println(tn);
        if(tn.size()>=2){
            for (int i=1;i<tn.size();i++){
                if(tn.get(i-1) >= tn.get(i)){
                    return false;
                }
            }
        }
        return true;
    }


   public List<Integer> getTn(TreeNode root, List<Integer> list){
        List<Integer> tn= list;
       if(root.left != null){
           tn = getTn(root.left, tn);
           tn.add(root.val);
       }
        if(root.left == null){
            tn.add(root.val);
        }

        if(root.right != null){
           tn = getTn(root.right, tn);

        }
        return tn;

    }




}
