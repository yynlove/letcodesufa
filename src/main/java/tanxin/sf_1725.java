package tanxin;

public class sf_1725 {


    /**
     * 给你一个数组 rectangles ，其中 rectangles[i] = [li, wi] 表示第 i 个矩形的长度为 li 、宽度为 wi 。
     *
     * 如果存在 k 同时满足 k <= li 和 k <= wi ，就可以将第 i 个矩形切成边长为 k 的正方形。例如，矩形 [4,6] 可以切成边长最大为 4 的正方形。
     *
     * 设 maxLen 为可以从矩形数组 rectangles 切分得到的 最大正方形 的边长。
     *
     * 返回可以切出边长为 maxLen 的正方形的矩形 数目 。
     * @param args
     */
    public static void main(String[] args) {

        final int[][] ints = {{5, 8}, {3, 9}, {5, 12}, {16, 5}};
        final sf_1725 sf_1725 = new sf_1725();
        final int i = sf_1725.countGoodRectangles(ints);
        System.out.println(i);
    }

    public int countGoodRectangles(int[][] rectangles) {
        int maxBian = 0;
        int sum =0;
        for (int i=0;i<rectangles.length;i++){
            final int maxBC = Math.min(rectangles[i][0], rectangles[i][1]);
            if(maxBian <  maxBC){
                maxBian =  maxBC;
                sum =0;
            }else if(maxBian >maxBC){
                continue;
            }
            sum++;
        }
        return sum;
    }

}
