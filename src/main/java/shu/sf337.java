package shu;

public class sf337 {

    /**
     * 在上次打劫完一条街道之后和一圈房屋后，小偷又发现了一个新的可行窃的地区。这个地区只有一个入口，我们称之为“根”。
     * 除了“根”之外，每栋房子有且只有一个“父“房子与之相连。一番侦察之后，聪明的小偷意识到“这个地方的所有房屋的排列类似于一棵二叉树”。
     * 如果两个直接相连的房子在同一天晚上被打劫，房屋将自动报警。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/house-robber-iii
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */
    public static void main(String[] args) {
        final TreeNode treeNode = new TreeNode(3, new TreeNode(2, null, new TreeNode(3)), new TreeNode(3, null, new TreeNode(1)));

        final sf337 sf337 = new sf337();

        final int rob = sf337.rob(treeNode);
        System.out.println(rob);

    }

    int jSum = 0;
    int oSum = 0;
    public int rob(TreeNode root) {

        rob(root,1);
        return Math.max(jSum,oSum);
    }

    private void rob(TreeNode root, int i) {

        if(root == null){
            return;
        }

        if(i%2 ==0){
            oSum = oSum + root.val;
        }else{
            jSum = jSum + root.val;
        }
        i++;
        rob(root.left,i);
        rob(root.right,i);
    }


}
