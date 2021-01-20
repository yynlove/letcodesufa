package shu;

import java.util.HashMap;

public class sf105 {


    /**
     * 根据一棵树的前序遍历与中序遍历构造二叉树。
     * 注意:
     * 你可以假设树中没有重复的元素。
     * @param args
     */
    public static void main(String[] args) {

        //前序遍历
        int[] preorder = {1,2,4,5,3,6,7};
        //中序遍历
        int[] inorder = {4,2,5,1,6,3,7};

        final sf105 sf105 = new sf105();
        final TreeNode treeNode = sf105.buildTree(preorder, inorder);
        System.out.println(treeNode);

    }






    public TreeNode buildTree(int[] preorder, int[] inorder) {
        final HashMap<Integer, Integer> inMap = new HashMap<>();
        for (int i=0;i< inorder.length;i++){
            inMap.put(inorder[i],i);
        }

        final TreeNode treeNode = buildTree(preorder, inorder, inMap, 0, inMap.size()-1, 0, inMap.size()-1);
        return treeNode;
    }


    /**
     *
     * @param preorder
     * @param inorder
     * @param inMap
     * @param ps 以ps为根的树在先根 开始遍历位置
     * @param pe 以ps为根的树在先根 结束位置
     * @param is 以ps为根的树在中根 开始位置
     * @param ie 以ps为根的树在中根 结束位置
     * @return
     */
    private TreeNode buildTree(int[] preorder, int[] inorder, HashMap<Integer, Integer> inMap, int ps, int pe, int is, int ie) {
        if(ps > pe || is > ie){
            return null;
        }else{
            final TreeNode treeNode = new TreeNode(preorder[ps]);
            //算出根坐标在中序的位置
            final Integer rootVal = inMap.get(preorder[ps]);
            //当前树节点数量
            final int leftN = rootVal - is;
            treeNode.left = buildTree(preorder,inorder,inMap,ps+1,ps+leftN,is,rootVal-1);
            treeNode.right = buildTree(preorder,inorder,inMap,ps+leftN+1,pe, rootVal+1,ie);
            return  treeNode;

        }
    }


}
