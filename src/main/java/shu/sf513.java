package shu;

import java.util.ArrayList;

public class sf513 {

    /**
     * 给定一个二叉树，在树的最后一行找到最左边的值。
     * @param args
     */
    public static void main(String[] args) {

        sf513 sf513 = new sf513();
        TreeNode treeNode = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        int bottomLeftValue = sf513.findBottomLeftValue(treeNode);
        System.out.println(bottomLeftValue);

    }


    public int findBottomLeftValue(TreeNode root) {
        ArrayList<Integer> integers = new ArrayList<>();
        dfs(root,1,integers);
        return integers.get(integers.size()-1);
    }

    private void dfs(TreeNode root, int i, ArrayList<Integer> integers) {
        if(root == null){
            return;
        }
        if(integers.size()<i){
            integers.add(root.val);
        }
        int i1 = i + 1;
        dfs(root.left,i1,integers);
        dfs(root.right,i1,integers);

    }


}
