package fenzhisuanfa;

public class sf54 {


    public static void main(String[] args) {

        int[] muns = new int[]{-2,1};

        final sf54 sf54 = new sf54();
        final int i = sf54.maxSubArray(muns);
        System.out.println(i);
    }



    /**
     * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        final int length = nums.length;
        int[] a = digui(nums,0,length-1);
        return a[2];
    }

    /**
     * 递归 遍历子树
     * @param nums
     * @param start
     * @param end
     * @return
     */
    private int[] digui(int[] nums, int start, int end) {

        if(start == end){
            return new int[]{start,end,nums[start]};
        }

        final int cur = (end - start) / 2 + start;
        //递归
        final int[] left = digui(nums, start, cur);
        final int[] right = digui(nums, cur+1, end);
        //涉及中间值的最大值
        final  int[] setCur =  setZhongJian(nums,start,cur ,end);
        if(left[2] >= right[2] && left[2] >= setCur[2]){
            return left;
        }else if(right[2] >= left[2] && right[2] >= setCur[2]){
            return right;
        }else {
            return setCur;
        }
    }

    /**
     * 分割点作为中间值一部分 进行计算最大值
     * @param nums
     * @param start
     * @param cur
     * @param end
     * @return
     */
    private int[] setZhongJian(int[] nums, int start, int cur, int end) {
        //最大值
        int sum =Integer.MIN_VALUE;
        int leftSum = 0;
        //涉及中间值的大小
        //往左遍历 求最大值
        for (int i=cur;i >= start;i--){
            leftSum = leftSum + nums[i];
            if(sum <= leftSum){
                sum = leftSum;
            }
        }
        //往右遍历 求最大值
        int rightSum =0;
        int rightMax =Integer.MIN_VALUE;
        for (int i=cur+1;i <= end;i++){
            rightSum =  rightSum + nums[i];
            if(rightMax <=  rightSum){
                rightMax = rightSum;
            }
        }
        return new int[]{start, end, sum+rightMax};

    }

}
