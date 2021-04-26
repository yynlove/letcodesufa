package dynamic_programming;

public class sf_91 {


    /**
     * 一条包含字母 A-Z 的消息通过以下映射进行了 编码 ：
     *
     * 'A' -> 1
     * 'B' -> 2
     * ...
     * 'Z' -> 26
     *
     * 要 解码 已编码的消息，所有数字必须基于上述映射的方法，反向映射回字母（可能有多种方法）。例如，"11106" 可以映射为：
     *
     *     "AAJF" ，将消息分组为 (1 1 10 6)
     *     "KJF" ，将消息分组为 (11 10 6)
     *
     * 注意，消息不能分组为  (1 11 06) ，因为 "06" 不能映射为 "F" ，这是由于 "6" 和 "06" 在映射中并不等价。
     *
     * 给你一个只含数字的 非空 字符串 s ，请计算并返回 解码 方法的 总数 。
     *
     * 题目数据保证答案肯定是一个 32 位 的整数。
     * @param args
     */
    public static void main(String[] args) {

        String s = "2611055971756562";
        final sf_91 sf_91 = new sf_91();

        final int i = sf_91.numDecodings(s);
        System.out.println(i);

    }


    /**
     * Char("48") 0
     * Char("49") 1
     * Char("50") 2
     * Char("51") 3
     * Char("52") 4　
     * Char("53") 5
     * Char("54") 6
     * Char("55") 7
     * Char("56") 8
     * Char("57") 9　
     * @param s
     * @return
     */
    public int numDecodings(String s) {
        final int[] ints = new int[s.length()];
        final char[] chars = s.toCharArray();
        if(chars[0] > '0' && chars[0]<= '9'){
            ints[0]=1;
        }else {
            return 0;
        }
        for (int i=1;i<chars.length;i++){
            ints[i] = (chars[i] == '0') ? 0 :ints[i-1];
            final boolean b = chars[i - 1] == '1' || chars[i - 1] == '2';
            if(i==1 && b && chars[i] <='6' ){
                ints[i] = ints[i] + ints[i - 1];
            }else if( i>=2 && b && chars[i] <='6'){
                ints[i] = ints[i] + ints[i - 2];
            }
        }

        return ints[s.length()-1];
    }



}
