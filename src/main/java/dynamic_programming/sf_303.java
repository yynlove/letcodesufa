package dynamic_programming;

public class sf_303 {


    /**
     * 给定一个整数数组  nums，求出数组从索引 i 到 j（i ≤ j）范围内元素的总和，包含 i、j 两点。
     *
     * 实现 NumArray 类：
     *
     *     NumArray(int[] nums) 使用数组 nums 初始化对象
     *     int sumRange(int i, int j) 返回数组 nums 从索引 i 到 j（i ≤ j）范围内元素的总和，包含 i、j 两点（也就是 sum(nums[i], nums[i + 1], ... , nums[j])）
     * @param args
     */
    public static void main(String[] args) {
        final int[] ints = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(ints);
        final int i2 = numArray.sumRange(0, 2);
        System.out.println(i2);
        final int i1 = numArray.sumRange(2, 5);
        System.out.println(i1);
        final int i = numArray.sumRange(0, 5);
        System.out.println(i);

    }



    static class NumArray {

        private int[] sums;

        public NumArray(int[] nums) {
            sums = new int[nums.length];
            if(nums.length ==0){
                return;
            }
            sums[0] = nums[0];
            for (int i=1; i<nums.length; i++){
                sums[i] = sums[i-1] +nums[i];
            }

        }

        public int sumRange(int left, int right) {
            if(left == 0){
                return  sums[right];
            }else {
                return  sums[right] - sums[left-1];
            }
        }
    }


}
