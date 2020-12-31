package shu;

import suanfa.sf02;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class sf95 {


    public static void main(String[] args) {

        final sf95 sf95 = new sf95();

        int n =5;
        final List<TreeNode> treeNodes = sf95.generateTrees(n);
        System.out.println(treeNodes.size());

    }


    /**
     * 给定一个整数 n，生成所有由 1 ... n 为节点所组成的 二叉搜索树 。
     *
     * 1.若任意结点的左子树不空，则左子树上所有结点的值均不大于它的根结点的值。
     * 2. 若任意结点的右子树不空，则右子树上所有结点的值均不小于它的根结点的值。
     * 3.任意结点的左、右子树也分别为二叉搜索树。
     *
     */
    public List<TreeNode> generateTrees(int n) {
        if(n==0){
            return new ArrayList<TreeNode>();
        }
        final List<TreeNode> ts = getTs(1, n);
        return ts;
    }


    public List<TreeNode> getTs(int s,int n){
        final ArrayList<TreeNode> treeNodes = new ArrayList<>();
        if(s>n){
            return treeNodes;
        }
        for (int i=s;i<=n;i++){
            final List<TreeNode> lts = getTs(s, i - 1);
            final List<TreeNode> rts = getTs(i + 1, n);
            if(lts.size()==0 && rts.size() !=0){
                for (int m=0;m<rts.size();m++){
                    final TreeNode treeNode = new TreeNode(i);
                    treeNode.right = rts.get(m);
                    treeNodes.add(treeNode);
                }
            } else if(lts.size()!=0 && rts.size() ==0){
                for (int z=0;z<lts.size();z++){
                    final TreeNode treeNode = new TreeNode(i);
                    treeNode.left= lts.get(z);
                    treeNodes.add(treeNode);
                }

            }else if(lts.size() != 0){
                for (int z=0;z<lts.size();z++){
                    for (int m=0;m<rts.size();m++){
                        final TreeNode treeNode = new TreeNode(i);
                        treeNode.left= lts.get(z);
                        treeNode.right = rts.get(m);
                        treeNodes.add(treeNode);
                    }
                }
            } else{
                final TreeNode treeNode = new TreeNode(i);
                treeNodes.add(treeNode);
            }
        }
        return treeNodes;

    }






}
