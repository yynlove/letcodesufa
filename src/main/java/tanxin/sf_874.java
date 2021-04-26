package tanxin;

public class sf_874 {

    /**
     * 机器人在一个无限大小的 XY 网格平面上行走，从点 (0, 0) 处开始出发，面向北方。该机器人可以接收以下三种类型的命令 commands ：
     *     -2 ：向左转 90 度
     *     -1 ：向右转 90 度
     *     1 <= x <= 9 ：向前移动 x 个单位长度
     * 在网格上有一些格子被视为障碍物 obstacles 。第 i 个障碍物位于网格点  obstacles[i] = (xi, yi) 。
     * 机器人无法走到障碍物上，它将会停留在障碍物的前一个网格方块上，但仍然可以继续尝试进行该路线的其余部分。
     * 返回从原点到机器人所有经过的路径点（坐标为整数）的最大欧式距离的平方。（即，如果距离为 5 ，则返回 25 ）
     * 注意：
     *
     *     北表示 +Y 方向。
     *     东表示 +X 方向。
     *     南表示 -Y 方向。
     *     西表示 -X 方向。
     * 示例 1：
     *
     * 输入：commands = [4,-1,3], obstacles = []
     * 输出：25
     * 解释：
     * 机器人开始位于 (0, 0)：
     * 1. 向北移动 4 个单位，到达 (0, 4)
     * 2. 右转
     * 3. 向东移动 3 个单位，到达 (3, 4)
     * 距离原点最远的是 (3, 4) ，距离为 32 + 42 = 25
     * @param args
     */
    public static void main(String[] args) {

        int[] commands = new int[]{4,-1,4,-2,4};
        int[][] obstacles = new int[][]{{2,4}};


        final sf_874 sf_874 = new sf_874();
        final int i = sf_874.robotSim(commands, obstacles);
        System.out.println(i);
    }


    public int robotSim(int[] commands, int[][] obstacles) {
        //定义方向
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};
        //当前位置，起始坐标
        int curDir =0,x=0,y=0;
        int tx,ty;
        for (int i=0;i<commands.length;i++){

            if(commands[i]>0){
                tx = x + dx[curDir];
                ty = y + dy[curDir];

            }


        }

        return 0;

    }


}
