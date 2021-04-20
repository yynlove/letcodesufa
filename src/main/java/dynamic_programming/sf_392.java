package dynamic_programming;

public class sf_392 {


    /**
     * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
     *
     * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
     *
     * 进阶：
     *
     * 如果有大量输入的 S，称作 S1, S2, ... , Sk 其中 k >= 10亿，你需要依次检查它们是否为 T 的子序列。在这种情况下，你会怎样改变代码？
     * @param args
     */
    public static void main(String[] args) {

        String s = "acb";
        String t = "ahbgdc";

        final sf_392 sf_392 = new sf_392();
        final boolean subsequence = sf_392.isSubsequence(s, t);
        System.out.println(subsequence);


    }


    public boolean isSubsequence(String s, String t) {

        if("".equals(s)){
            return true;
        }
        boolean flag = false;
        final int[] ints = new int[s.length()];
        final char[] sChars = s.toCharArray();
        final char[] tChars = t.toCharArray();
        for (int i=0;i<sChars.length;i++){
            if(i==0){
                for (int j=0;j< tChars.length;j++){
                    if(sChars[0] == tChars[j]){
                        ints[0] = j;
                        flag = true;
                        break;
                    }
                }
            }else {
                flag = false;
                for (int j= ints[i-1]+1 ;j<tChars.length;j++){
                    if(sChars[i] == tChars[j]) {
                        ints[i] = j;
                        flag = true;
                        break;
                    }
                }
            }
            if(!flag){
                break;
            }
        }
        return flag;

    }



}
