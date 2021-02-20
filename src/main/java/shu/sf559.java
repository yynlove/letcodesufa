package shu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sf559 {


    /**
     * 计算一棵树的深度
     * @param args
     */
    public static void main(String[] args) {


        final sf559 sf559 = new sf559();

        final ArrayList<dNode> dNodes = new ArrayList<>();
        final List<dNode> dNodes1 = new ArrayList<>();
        dNodes1.add(new dNode(5));
        dNodes1.add(new dNode(6));

        dNodes.add(new dNode(3, dNodes1));
        dNodes.add(new dNode(2));
        dNodes.add(new dNode(4));

        final dNode dNode = new dNode(1, dNodes);

        final int i = sf559.maxDepth(dNode);

        System.out.println(i);

    }





    public int maxDepth(dNode root) {
        if(root == null) {
            return 0;
        }
        int depth = 0;
        for(int i = 0;i<root.children.size();i++){
            depth = Math.max(depth,maxDepth(root.children.get(i)));
        }
        return depth+1;
    }


    private int maxDepth1(dNode root, Integer dfs) {

        if(root == null){
            return dfs;
        }
        dfs = dfs + 1;
        if (root.children != null && root.children.size() !=0){
            int[] a = new int[root.children.size()];
            for (int i=0; i<root.children.size();i++) {
               a[i]= maxDepth1(root.children.get(i),dfs);
            }
          return  Arrays.stream(a).max().getAsInt();
        }
        return dfs;

    }


}
