package tanxin;

public class sf_1758 {


    /**
     * 给你一个仅由字符 '0' 和 '1' 组成的字符串 s 。一步操作中，你可以将任一 '0' 变成 '1' ，或者将 '1' 变成 '0' 。
     *
     * 交替字符串 定义为：如果字符串中不存在相邻两个字符相等的情况，那么该字符串就是交替字符串。例如，字符串 "010" 是交替字符串，而字符串 "0100" 不是。
     *
     * 返回使 s 变成 交替字符串 所需的 最少 操作数。
     *
     * @param args
     */
    public static void main(String[] args) {

        final sf_1758 sf_1758 = new sf_1758();
        String s = "0100";
        final int i = sf_1758.minOperations(s);
        System.out.println(i);
    }

    public int minOperations(String s) {
        int j0=0;
        int j1=0;
        int o0=0;
        int o1 =0;
        for (int i=0;i<s.length();i++){

            if(i%2==0 && s.charAt(i)== '0'){
                o0++;
            }else if(i%2==0){
                o1++;
            }else if(i%2!=0 && s.charAt(i) == '0'){
                j0++;
            }else {
                j1++;
            }
        }
        final int min = Math.min(j0 + o1, j1 + o0);
        return min;


    }


}
