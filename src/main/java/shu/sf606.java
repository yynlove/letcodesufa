package shu;

public class sf606 {

    /**
     * 你需要采用前序遍历的方式，将一个二叉树转换成一个由括号和整数组成的字符串。
     *
     * 空节点则用一对空括号 "()" 表示。而且你需要省略所有不影响字符串与原始二叉树之间的一对一映射关系的空括号对。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/construct-string-from-binary-tree
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */
    public static void main(String[] args) {

        final TreeNode treeNode = new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3));
        final sf606 sf606 = new sf606();
        final String str = sf606.tree2str(treeNode);
        System.out.println(str);
    }



    public String tree2str(TreeNode t) {

        final StringBuilder stringBuilder = new StringBuilder();
        tree2str(t,stringBuilder);
        return stringBuilder.toString();

    }

    private void tree2str(TreeNode t, StringBuilder sb) {
        if(t == null){
            return;
        }

        sb.append(t.val);
        if(t.right != null){
            sb.append("(");
            tree2str(t.left,sb);
            sb.append(")(");
            tree2str(t.right,sb);
            sb.append(")");
        }else if(t.left != null){
            sb.append("(");
            tree2str(t.left,sb);
            sb.append(")");

        }

    }


}
