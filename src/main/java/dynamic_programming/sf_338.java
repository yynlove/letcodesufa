package dynamic_programming;

import java.util.Arrays;

public class sf_338 {


    /**
     * 给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作为数组返回。
     * 示例 1:
     * 输入: 2
     * 输出: [0,1,1]
     * 示例 2:
     * 输入: 5
     * 输出: [0,1,1,2,1,2]
     * @param args
     */
    public static void main(String[] args) {
        final sf_338 sf_338 = new sf_338();

        final int[] ints = sf_338.countBits(8);
        for (int anInt : ints) {
            System.out.println(anInt);
        }

    }

    /**
     *
     * 0  0000  0
     * 1  0001  1
     * 2  0010  1
     * 3  0011  2
     * 4  0100  1
     * 5  0101  2
     * 6  0110  2
     * 7  0111  3
     * 8  1000  1
     * 9  1001  2
     * 10  1010  2
     * 11  1011  3
     * 12  1100  2
     * 13  1101  3
     * 14  1110  3
     * 15  1111 4
     */
    /**
     * 状态转移方程 d(0) =0,d(n) = d(n%2)+1
     * @param num
     * @return
     */
    public int[] countBits(int num) {

        final int[] ints = new int[num+1];
        //小于当前循环中最大的以2为底的指数的数
        int log2 = 1;
        ints[0] = 0;
        for (int i=1;i <= num;i++){
            if(log2 * 2 < i){
                log2 = log2*2;
            }
            ints[i] = ints[i% log2]+1;
        }
        return ints;
    }


}
