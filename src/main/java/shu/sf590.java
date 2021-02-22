package shu;

import java.util.ArrayList;
import java.util.List;

public class sf590 {


    /**
     * 后序遍历
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

        final sf590 sf590 = new sf590();
        final List<Integer> postorder = sf590.postorder(dNode);
        System.out.println(postorder.toString());
    }


    public List<Integer> postorder(dNode root) {

        final List<Integer> list = new ArrayList<>();
        postorder(root,list);
        return list;

    }


    private void postorder(dNode root, List<Integer> list) {
        if(root == null){
            return;
        }
        if(root.children != null && root.children.size()>0){
            for (dNode node: root.children) {
                postorder(node,list);
            }
        }
        list.add(root.val);
    }



}
