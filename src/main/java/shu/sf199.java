package shu;

import java.util.ArrayList;
import java.util.List;

public class sf199 {


    /**
     * 给定一棵二叉树，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。
     * @param args
     */
    public static void main(String[] args) {

        final TreeNode treeNode = new TreeNode(1, new TreeNode(2, null, new TreeNode(4, new TreeNode(6), null)), new TreeNode(3, new TreeNode(5), null));

        final sf199 sf199 = new sf199();
        final List<Integer> integers = sf199.rightSideView(treeNode);
        System.out.println(integers.toString());
    }



    List<Integer> arrayList = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        hgBS(root,0);
        return arrayList;
    }


    public void hgBS(TreeNode root,int cengci){

        if(root == null){
            return;
        }
        if(arrayList.size()<= cengci){
            arrayList.add(root.val);
        }
        cengci= cengci+1;
        hgBS(root.right,cengci);
        hgBS(root.left,cengci);
    }











}
