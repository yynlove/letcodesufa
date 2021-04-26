package tanxin;

public class sf_1710 {


    /**
     * 请你将一些箱子装在 一辆卡车 上。给你一个二维数组 boxTypes ，其中 boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi] ：
     *
     *     numberOfBoxesi 是类型 i 的箱子的数量。
     *     numberOfUnitsPerBoxi 是类型 i 每个箱子可以装载的单元数量。
     *
     * 整数 truckSize 表示卡车上可以装载 箱子 的 最大数量 。只要箱子数量不超过 truckSize ，你就可以选择任意箱子装到卡车上。
     *
     * 返回卡车可以装载 单元 的 最大 总数。
     * @param args
     */
    public static void main(String[] args) {
        final int[][] ints = {{5, 10}, {2, 5}, {4, 7}, {3, 9}};
        final sf_1710 sf_1710 = new sf_1710();

        final int i = sf_1710.maximumUnits(ints, 10);
        System.out.println(i);
    }



    public int maximumUnits(int[][] boxTypes, int truckSize) {

        for (int i=0;i< boxTypes.length-1;i++){
            for (int j=i;j< boxTypes.length;j++){
                if(boxTypes[j][1]>boxTypes[i][1]){
                    int[] temp = boxTypes[i];
                    boxTypes[i] = boxTypes[j];
                    boxTypes[j] = temp;
                }
            }
        }

        int sum =0;
        for (int i=0;i< boxTypes.length;i++){
            if(truckSize>=boxTypes[i][0]){
                sum = sum + boxTypes[i][0]*boxTypes[i][1];
                truckSize = truckSize - boxTypes[i][0];
            }else if(truckSize< boxTypes[i][0]){
                sum = sum + truckSize*boxTypes[i][1];
                break;
            }
        }
        return sum;

    }



}
