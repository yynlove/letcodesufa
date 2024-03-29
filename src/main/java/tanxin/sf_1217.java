package tanxin;

public class sf_1217 {


    /**
     * 数轴上放置了一些筹码，每个筹码的位置存在数组 chips 当中。
     *
     * 你可以对 任何筹码 执行下面两种操作之一（不限操作次数，0 次也可以）：
     *
     *     将第 i 个筹码向左或者右移动 2 个单位，代价为 0。
     *     将第 i 个筹码向左或者右移动 1 个单位，代价为 1。
     *
     * 最开始的时候，同一位置上也可能放着两个或者更多的筹码。
     *
     * 返回将所有筹码移动到同一位置（任意位置）上所需要的最小代价。
     * @param args
     */
    public static void main(String[] args) {

        final sf_1217 sf_1217 = new sf_1217();

        int[] a= new int[]{1,2,3};
        final int i = sf_1217.minCostToMoveChips(a);
        System.out.println(i);
    }

    /**
     * 所有的奇数移动到奇数中是不需要代表的，偶数也是，所以起始是查看最小奇数个数和最小偶数个数
     * @param position
     * @return
     */
    public int minCostToMoveChips(int[] position) {
        int j=0;
        int o =0;
        for (int i=0;i< position.length;i++){
            if(position[i]%2==0){
                o++;
            }else {
                j++;
            }
        }
        return Math.min(o,j);

    }


}
