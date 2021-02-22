package shu;

import java.util.ArrayList;
import java.util.List;

public class sf589 {

    /**
     * n叉树的前序遍历
     * @param args
     */
    public static void main(String[] args) {
        final ArrayList<dNode> dNodes = new ArrayList<>();
        final List<dNode> dNodes1 = new ArrayList<>();
        dNodes1.add(new dNode(5));
        dNodes1.add(new dNode(6));

        dNodes.add(new dNode(3, dNodes1));
        dNodes.add(new dNode(2));
        dNodes.add(new dNode(4));

        final dNode dNode = new dNode(1, dNodes);
        final sf589 sf589 = new sf589();

        final List<Integer> preorder = sf589.preorder(dNode);
        System.out.println(preorder.toString());
    }


    public List<Integer> preorder(dNode root) {
        final List<Integer> list = new ArrayList<>();
        preorder(root,list);
        return list;
    }

    private void preorder(dNode root, List<Integer> list) {
        if(root == null){
            return;
        }
        list.add(root.val);
        if(root.children != null && root.children.size()>0){
            for (dNode node: root.children) {
                preorder(node,list);
            }
        }
    }


}
