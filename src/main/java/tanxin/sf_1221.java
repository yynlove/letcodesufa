package tanxin;

public class sf_1221 {


    /**
     * 在一个 平衡字符串 中，'L' 和 'R' 字符的数量是相同的。
     *
     * 给你一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
     *
     * 注意：分割得到的每个字符串都必须是平衡字符串。
     *
     * 返回可以通过分割得到的平衡字符串的 最大数量 。
     * @param args
     */
    public static void main(String[] args) {
        String s = "RLLLLRRRLR";
        final sf_1221 sf_1221 = new sf_1221();
        final int i = sf_1221.balancedStringSplit(s);
        System.out.println(i);
    }


    public int balancedStringSplit(String s) {

        int lSum =0;
        int rSum =0;
        int sum =0;
        final char[] chars = s.toCharArray();
        for (int i=0;i<chars.length;i++){
            if(chars[i]  == 'L'){
                lSum++;
            }else {
                rSum++;
            }
            if(lSum != 0 && lSum == rSum ){
               sum++;
               lSum = rSum = 0;
            }
        }
        return sum;

    }


}
