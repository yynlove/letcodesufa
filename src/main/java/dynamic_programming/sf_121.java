package dynamic_programming;

public class sf_121 {

    /**
     * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
     * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
     * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
     * @param args
     */
    public static void main(String[] args) {

        final int[] ints = {7, 1, 5, 3, 6, 4};

        final sf_121 sf_121 = new sf_121();
        final int i = sf_121.maxProfit(ints);
        System.out.println(i);
    }


    /**
     * 状态转移方程 前i天的最大收益 = Max(前i-1天的最大收益，第i天的价格-前i-1天中的最小价格)
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {

        int max = 0;
        int min = prices[0];
        for (int i=1;i<prices.length;i++){
            max = Math.max(max,prices[i]-min);
            min = Math.min(min,prices[i]);
        }
        return max;

    }
}
