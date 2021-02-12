package shu;

import java.util.ArrayList;
import java.util.List;

public class sf437 {


    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode(10, new TreeNode(5, new TreeNode(3, new TreeNode(3), new TreeNode(-2)), new TreeNode(2, null, new TreeNode(1))), new TreeNode(-3, null, new TreeNode(11)));
        sf437 sf437 = new sf437();
        int i = sf437.pathSum(treeNode, 8);
        System.out.println(i);
    }


    public int pathSum(TreeNode root, int sum) {

        List<Integer> integers = new ArrayList<>();
        return pathSum(root, sum, integers);
    }

    private int pathSum(TreeNode root, int sum, List<Integer> integers) {

        int total=0;
        if(root == null){
            return 0;
        }
        ArrayList<Integer> integers1 = new ArrayList<>(integers);
        for (int i=0;i<integers1.size();i++){
            int value = integers1.get(i) + root.val;
            if(value == sum){
                total=total+1;
            }
            integers1.set(i,value);
        }
        integers1.add(root.val);
        if(root.val == sum){
            total=total+1;
        }
      return total+ pathSum(root.left,sum,integers1) + pathSum(root.right,sum,integers1);
    }

}
