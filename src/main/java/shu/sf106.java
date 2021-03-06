package shu;

import java.util.HashMap;

public class sf106 {

    /**
     *根据一棵树的中序遍历与后序遍历构造二叉树。
     * @param args
     */
    public static void main(String[] args) {
        //中序遍历
        int[] inorder = {4,2,5,1,6,3,7};
        //后序遍历
        int[] postorder  = {4,5,2,6,7,3,1};
        final sf106 sf106 = new sf106();
        final TreeNode treeNode = sf106.buildTree(inorder, postorder);
        System.out.println(treeNode);
    }


    public TreeNode buildTree(int[] inorder, int[] postorder) {
        final HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        for (int i=0;i< inorder.length;i++){
            integerIntegerHashMap.put(inorder[i],i);
        }
        TreeNode tn = buildTree(inorder,postorder,integerIntegerHashMap,0,integerIntegerHashMap.size()-1,0,integerIntegerHashMap.size()-1);
        return tn;
    }




    private TreeNode buildTree(int[] inorder, int[] postorder, HashMap<Integer, Integer> integerIntegerHashMap, int is, int ie, int ps, int pe) {
        if(is>ie || ps>pe){
            return null;
        }
        final TreeNode treeNode = new TreeNode(postorder[pe]);
        //根节点再中序数组中的位置
        final Integer rootVal = integerIntegerHashMap.get(postorder[pe]);
        //中序左孩子数量
        final int number = rootVal - is;
        treeNode.left = buildTree(inorder,postorder,integerIntegerHashMap,is,rootVal-1,ps,ps+number-1);
        treeNode.right = buildTree(inorder,postorder,integerIntegerHashMap,rootVal+1,ie,ps+number,pe-1);
        return treeNode;
    }


}
