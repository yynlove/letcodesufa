package shu;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class sf429 {


    public static void main(String[] args) {

        final ArrayList<dNode> dNodes = new ArrayList<>();
        final List<dNode> dNodes1 = new ArrayList<>();
        dNodes1.add(new dNode(5));
        dNodes1.add(new dNode(6));

        dNodes.add(new dNode(3, dNodes1));
        dNodes.add(new dNode(2));
        dNodes.add(new dNode(4));

        final dNode dNode = new dNode(1, dNodes);
        final sf429 sf429 = new sf429();

        final List<List<Integer>> lists = sf429.levelOrder(dNode);
        System.out.println(lists.toString());
    }



    public List<List<Integer>> levelOrder(dNode root) {
        

        return null;
    }



}
