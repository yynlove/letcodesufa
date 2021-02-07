package shu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class sf173 {


    /**
     * 实现一个二叉搜索树迭代器。你将使用二叉搜索树的根节点初始化迭代器。
     *
     * 调用 next() 将返回二叉搜索树中的下一个最小的数。
     * @param args
     */
    public static void main(String[] args) {

        final TreeNode treeNode = new TreeNode(7, new TreeNode(3), new TreeNode(15, new TreeNode(9), new TreeNode(20)));

        final BSTIterator bstIterator = new BSTIterator(treeNode);
        while (bstIterator.hasNext()){
            System.out.println(bstIterator.next());
        }


    }



    static class BSTIterator{


        int cur ;
        int lastRef = -1;
        List<TreeNode> dateList = new ArrayList<>();

        public BSTIterator(TreeNode root) {
            setDateList(root);
            lastRef = dateList.size();
        }

        public void setDateList(TreeNode root){

            if(root == null){
                return;
            }

            setDateList(root.left);
            dateList.add(root);
            setDateList(root.right);
        }


        public int next() {
          return  dateList.get(cur++).val;
        }

        public boolean hasNext() {
            return cur != lastRef;
        }


    }


}
