package tanxin;

public class sf_944 {

    /**
     * 给你由 n 个小写字母字符串组成的数组 strs，其中每个字符串长度相等。
     *
     * 这些字符串可以每个一行，排成一个网格。例如，strs = ["abc", "bce", "cae"] 可以排列为：
     *
     * abc
     * bce
     * cae
     *
     * 你需要找出并删除 不是按字典序升序排列的 列。在上面的例子（下标从 0 开始）中，列 0（'a', 'b', 'c'）和列 2（'c', 'e', 'e'）都是按升序排列的，而列 1（'b', 'c', 'a'）不是，所以要删除列 1 。
     *
     * 返回你需要删除的列数。
     * @param args
     */
    public static void main(String[] args) {

        final String[] strings = {"cba", "daf", "ghi"};

        final sf_944 sf_944 = new sf_944();
        final int i = sf_944.minDeletionSize(strings);
        System.out.println(i);

    }

    public int minDeletionSize(String[] strs) {
        int sum =0;
        for (int i=0;i<strs[0].length();i++){
            for (int j=1;j<strs.length;j++){
                if(strs[j].charAt(i) <strs[j-1].charAt(i)){
                    sum++;
                    break;
                }
            }
        }
        return sum;

    }



}
