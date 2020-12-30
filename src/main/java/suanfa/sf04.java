package suanfa;

import java.util.ArrayList;

public class sf04 {

    public static void main(String[] args) {

        int[] nums1 = {3};

        int[] nums2 = {-2,-1};
        final sf04 sf04 = new sf04();
        final double medianSortedArrays = sf04.findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);
    }

    /**
     * 给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的中位数。
     *
     * 进阶：你能设计一个时间复杂度为 O(log (m+n)) 的算法解决此问题吗？
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if(nums1.length ==0 && nums2.length ==0){
            return 0;
        }else if(nums1.length ==0){
            final int i = nums2.length / 2;
            return (nums2.length % 2)==0?(double) (nums2[i-1]+nums2[i])/2:nums2[i];
        }else if(nums2.length ==0){
            final int i = nums1.length / 2;
            return (nums1.length % 2)==0?(double) (nums1[i-1]+nums1[i])/2:nums1[i];
        }else{
            final ArrayList<Integer> integers = new ArrayList<Integer>();
            int z=nums2.length-1;
            for (int i=nums1.length-1; i>=0; i--){
                while ( z>= 0 && nums2[z]>nums1[i]){
                    integers.add(nums2[z]);
                    z--;
                }
                integers.add(nums1[i]);
            }
            while (z>=0){
                integers.add(nums2[z]);
                z--;
            }
            final int i = integers.size() / 2;
            if(integers.size() %2 ==0){
                return  (double) (integers.get(i - 1) + integers.get(i)) / 2;
            }else{
                return integers.get(i);
            }
        }
    }



    


}
