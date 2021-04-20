package dynamic_programming;

public class sf_746 {


    /**
     * 数组的每个下标作为一个阶梯，第 i 个阶梯对应着一个非负数的体力花费值 cost[i]（下标从 0 开始）。
     * 每当你爬上一个阶梯你都要花费对应的体力值，一旦支付了相应的体力值，你就可以选择向上爬一个阶梯或者爬两个阶梯。
     * 请你找出达到楼层顶部的最低花费。在开始时，你可以选择从下标为 0 或 1 的元素作为初始阶梯。
     * @param args
     */
    public static void main(String[] args) {

        final int[] ints = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        final sf_746 sf_746 = new sf_746();
        final int i = sf_746.minCostClimbingStairs(ints);
        System.out.println(i);

    }


    /**
     * 状态转移方程 min[i] = Min(min[i-1],min[i-2])+array[i];
     * @param cost
     * @return
     */
    public int minCostClimbingStairs(int[] cost) {
        final int[] ints = new int[cost.length];
        ints[0] = cost[0];
        ints[1] = cost[1];
        for (int i = 2;i < cost.length;i++){
            int i1 = Math.min(ints[i-1], ints[i-2]) + cost[i];
            ints[i] = i1;
        }
        return Math.min(ints[cost.length-2],ints[cost.length-1]);
    }

}
