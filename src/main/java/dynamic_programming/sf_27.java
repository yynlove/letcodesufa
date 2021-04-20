package dynamic_programming;

public class sf_27 {


    /**
     * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
     * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
     * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
     * @param args
     */
    public static void main(String[] args) {
        int[] a = new int[]{3,2,2,3};
        int val = 3;
        final sf_27 sf_27 = new sf_27();
        final int i = sf_27.removeElement(a, val);
        System.out.println(i);
    }



    public int removeElement(int[] nums, int val) {

        if(nums == null || nums.length ==0){
            return 0;
        }
        int j=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

}
