package SF_Array;

public class sf_1486 {


    /**
     * 给你两个整数，n 和 start 。
     *
     * 数组 nums 定义为：nums[i] = start + 2*i（下标从 0 开始）且 n == nums.length 。
     *
     * 请返回 nums 中所有元素按位异或（XOR）后得到的结果。
     * @param args
     */
    public static void main(String[] args) {
        final sf_1486 sf_1486 = new sf_1486();
        final int i = sf_1486.xorOperation(4, 3);
        System.out.println(i);
    }



    /**
     * 二进制变量的声明以0b为前缀；
     * 八进制变量的声明以0为前缀；
     * 十六进制变量的声明以0x为前缀。
     int a3 = 0b0011;
     int a5 = 0b0101;
     int a7 = 0b0111;
     int a9 = 0b1001;
     */
    public int xorOperation(int n, int start) {
        int r = start;
        for (int i=1;i<n ;i++){
            r = r ^ start+i*2;
        }
        return r;

    }


}
