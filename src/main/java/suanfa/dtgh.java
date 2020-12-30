package suanfa;

public class dtgh {

    public static void main(String[] args) {
        final dtgh dtgh = new dtgh();
/*
        int[] a = {8,1,5,2,6};

        final int i = dtgh.maxScoreSightseeingPair(a);
        System.out.println(i);

        */

        int[] ab = {-2,1,-3,4,-1,2,1,-5,4};
        final int i = dtgh.maxSubArray(ab);
        System.out.println(i);
    }



    public int maxSubArray(int[] nums) {
        int res = nums[0];
        for(int i = 1; i < nums.length; i++) {
            nums[i] =nums[i] + Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
            System.out.println(res+">>"+nums[i]);
        }
        return res;
    }


    /**
     * 动态规划
     * @param A
     * @return
     */
    public int maxScoreSightseeingPair(int[] A) {
        int max=0,first=A[0]+0;
        for (int j=1;j<A.length;++j){
            max=Math.max(max,first+A[j]-j);
            System.out.println(j+">>>"+max);
            first=Math.max(first,A[j]+j);
        }
        return max;
    }
}
