package SF_Array;

import java.util.Arrays;

public class sf_1011 {
    /**
     * 传送带上的包裹必须在 D 天内从一个港口运送到另一个港口。
     *
     * 传送带上的第 i 个包裹的重量为 weights[i]。每一天，我们都会按给出重量的顺序往传送带上装载包裹。我们装载的重量不会超过船的最大运载重量。
     *
     * 返回能在 D 天内将传送带上的所有包裹送达的船的最低运载能力。
     *
     * @param args
     */
    public static void main(String[] args) {

        final int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int D = 5;
        final sf_1011 sf_1011 = new sf_1011();
        final int i = sf_1011.shipWithinDays(ints, D);
        System.out.println(i);
    }

    public int shipWithinDays(int[] weights, int D) {

        int sum = Arrays.stream(weights).sum();
        int max = Arrays.stream(weights).max().getAsInt();

        while (max<sum){
            int mid = (max + sum)/2;
            int temp =0;
            int day =1;

            for (int weight :weights) {
                temp += weight;
                if (temp > mid) {
                    day += 1;
                    temp = weight;
                }
            }

            if(day> D){
                max = mid +1;
            }else{
                sum = mid;
            }


        }

        return max;




    }

}
