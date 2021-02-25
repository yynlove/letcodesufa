package shu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class sf655 {


    /**
     * 在一个 m*n 的二维字符串数组中输出二叉树，并遵守以下规则：
     *
     *     行数 m 应当等于给定二叉树的高度。
     *     列数 n 应当总是奇数。
     *     根节点的值（以字符串格式给出）应当放在可放置的第一行正中间。根节点所在的行与列会将剩余空间划分为两部分（左下部分和右下部分）。你应该将左子树输出在左下部分，右子树输出在右下部分。左下和右下部分应当有相同的大小。即使一个子树为空而另一个非空，你不需要为空的子树输出任何东西，但仍需要为另一个子树留出足够的空间。然而，如果两个子树都为空则不需要为它们留出任何空间。
     *     每个未使用的空间应包含一个空的字符串""。
     *     使用相同的规则输出子树。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/print-binary-tree
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */
    public static void main(String[] args) {


        final TreeNode treeNode = new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3));
        final sf655 sf655 = new sf655();
        final List<List<String>> lists = sf655.printTree(treeNode);
        System.out.println(lists.toString());
    }


    /**
     * 先把数组赋初值 然后遍历放入值
     * @param root
     * @return
     */
    public List<List<String>> printTree(TreeNode root) {
        //求取最大深度
        final int n = dfs(root);
        int m = (int) (Math.pow(2,n)-1);
        final List<List<String>> lists = new ArrayList<>(n);
        for (int i=0;i<n;i++){
            final List<String> strings = new ArrayList<>(m);
            for (int j=0;j<m;j++){
                strings.add("");
            }
            lists.add(strings);
        }

        int startIndex = 0;
        dfsbianli(root,lists,startIndex,m-1,0);

        return  lists;
    }

    /**
     * 遍历放入
     * @param root
     * @param lists
     * @param startIndex
     * @param endIndex
     * @param dIndex
     */
    private void dfsbianli(TreeNode root, List<List<String>> lists, int startIndex, int endIndex,int dIndex) {
        if(root == null || startIndex>endIndex){
            return;
        }
        final int i = startIndex + (endIndex - startIndex) / 2;
        lists.get(dIndex).set(i,String.valueOf(root.val));
        dIndex++;
        dfsbianli(root.left,lists,startIndex,i-1,dIndex);
        dfsbianli(root.right,lists,i+1,endIndex,dIndex);
    }

    private int dfs(TreeNode root) {

        if(root == null){
            return 0;
        }
        return Math.max(dfs(root.left),dfs(root.right))+1;
    }


}
