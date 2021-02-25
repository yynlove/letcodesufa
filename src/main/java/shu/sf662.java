package shu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.DelayQueue;

public class sf662 {


    /**
     *给定一个二叉树，编写一个函数来获取这个树的最大宽度。树的宽度是所有层中的最大宽度。这个二叉树与满二叉树（full binary tree）结构相同，但一些节点为空。
     *
     * 每一层的宽度被定义为两个端点（该层最左和最右的非空节点，两端点间的null节点也计入长度）之间的长度。
     * @param args
     */
    public static void main(String[] args) {

        final TreeNode treeNode = new TreeNode(1, new TreeNode(3, new TreeNode(5), new TreeNode(3)), new TreeNode(2, null, new TreeNode(9)));
        final sf662 sf662 = new sf662();

        final int i = sf662.widthOfBinaryTree(treeNode);
        System.out.println(i);

    }

    int max = Integer.MIN_VALUE;


    /**
     * 递归
     */
        public int widthOfBinaryTree1(TreeNode root) {

        final List<Integer> integers = new ArrayList<>();
        dfs(root,1,1,integers);
        return max;


    }

    /**
     * 递归
     * @param root
     * @param level  节点层次
     * @param index   第几个节点
     * @param left 记录每行最左边的节点的index
     */
    private void dfs(TreeNode root, int level, int index, List<Integer> left) {

        if(root == null){
            return;
        }
        //判断树的层次是否大于集合长度，如果大于，则说明当前层的最左边节点并没有加入集合中
        if(level > left.size()){
            left.add(index);
        }
        //比较当前节点 和当前层最左边节点的大小，并取最大值
        max = Math.max(max,index - left.get(level-1)+1);
        dfs(root.left,level+1,index*2,left);
        dfs(root.right,level+1,index*2+1,left);
    }


    /**
     * 非递归做法
     * @param root
     * @return
     */
    public int widthOfBinaryTree(TreeNode root) {
        if(root ==null){
            return 0;
        }
        int max =1;
        final Queue<TreeNode> queue = new LinkedList<>();
        final LinkedList<Integer> indexQueue = new LinkedList<>();
        queue.offer(root);
        indexQueue.offer(1);
        while (!queue.isEmpty()){
            //遍历每一层
            final int size = queue.size();
            for (int i=0;i<size;i++){
                final TreeNode poll = queue.poll();
                final Integer index = indexQueue.poll();

                if(poll.left != null){
                    queue.offer(poll.left);
                    indexQueue.add(2*index);
                }

                if(poll.right != null){
                    queue.offer(poll.right);
                    indexQueue.add(2* index+1 );
                }
            }
            //计算下一层的长度
            if(indexQueue.size()>=2){
                max= Math.max(max,indexQueue.getLast() - indexQueue.getFirst() +1);
            }
        }
        return max;
    }


}
