package shu;


import java.util.List;

public class dNode {
    public int val;
    public List<dNode> children;

    public dNode() {}

    public dNode(int _val) {
        val = _val;
    }

    public dNode(int _val, List<dNode> _children) {
        val = _val;
        children = _children;
    }

    @Override
    public String toString() {
        return "dNode{" +
                "val=" + val +
                ", children=" + children +
                '}';
    }
};
