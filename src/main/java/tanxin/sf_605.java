package tanxin;

public class sf_605 {

    /**
     * 假设有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
     *
     * 给你一个整数数组  flowerbed 表示花坛，由若干 0 和 1 组成，其中 0 表示没种植花，1 表示种植了花。另有一个数 n ，能否在不打破种植规则的情况下种入 n 朵花？能则返回 true ，不能则返回 false。
     * 示例 1：
     * 输入：flowerbed = [1,0,0,0,1], n = 1
     * 输出：true
     * 示例 2：
     * 输入：flowerbed = [1,0,0,0,1], n = 2
     * 输出：false
     * @param args
     */
    public static void main(String[] args) {
        int[] a = new int[]{0,0,1,0,0};
        final sf_605 sf_605 = new sf_605();
        final boolean b = sf_605.canPlaceFlowers(a, 1);
        System.out.println(b);
    }


    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(flowerbed.length ==1){
            return (flowerbed[0] == 0)? 1>=n :0==n;
        }
        int index =0;
        for (int i=0;i< flowerbed.length ; i++){
            if(i==0 && flowerbed[i] == 0 && flowerbed[i+1] ==0){
                index++;
                flowerbed[i]=1;
            }else if(i == flowerbed.length-1 && flowerbed[i-1]==0 && flowerbed[i]==0 ){
                index++;
            }else if(i>0 && i< flowerbed.length-1 && flowerbed[i-1] == flowerbed[i] && flowerbed[i] ==flowerbed[i+1]&& flowerbed[i] ==0){
                index++;
                flowerbed[i]=1;
            }
        }
        return index>=n;
    }




}
