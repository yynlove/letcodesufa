package tanxin;

public class sf_1518 {

    /**
     * 小区便利店正在促销，用 numExchange 个空酒瓶可以兑换一瓶新酒。你购入了 numBottles 瓶酒。
     *
     * 如果喝掉了酒瓶中的酒，那么酒瓶就会变成空的。
     *
     * 请你计算 最多 能喝到多少瓶酒。
     * @param args
     */
    public static void main(String[] args) {

        int numBottles = 15;
        int numExchange = 4;

        final sf_1518 sf_1518 = new sf_1518();
        final int i = sf_1518.numWaterBottles(numBottles, numExchange);
        System.out.println(i);

    }


    public int numWaterBottles(int numBottles, int numExchange) {
        int sum =0;
        while (numBottles>=numExchange){
            final int i = numBottles / numExchange;
            sum =sum + numExchange*i;
            numBottles = i + numBottles % numExchange;
        }
        sum += numBottles;
        return sum;
    }




}
