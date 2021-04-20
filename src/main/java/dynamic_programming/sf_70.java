package dynamic_programming;

public class sf_70 {


    /**
     * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
     * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
     * 注意：给定 n 是一个正整数。
     * @param args
     */
    public static void main(String[] args) {

        final sf_70 sf_70 = new sf_70();
        final int i = sf_70.climbStairs(3);
        System.out.println(i);


    }




    public int climbStairs(int n) {
        final int[] ints = new int[n];
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else if(n == 2){
            return 2;
        }
        ints[0] = 1;
        ints[1] = 2;
        for (int i = 2;i<n; i++){
            ints[i] = ints[i-1] + ints[i-2];
        }
        return ints[n-1];
    }



}
