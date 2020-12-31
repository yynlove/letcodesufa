package shu;


/**
 * 时间超时
 */
public class sf96 {


    /**
     * 给定一个整数 n，求以 1 ... n 为节点组成的二叉搜索树有多少种？
     *
     *
     *
     */


    public static void main(String[] args) {

        int a = 4;
        final sf96 sf96 = new sf96();
        final int i = sf96.numTrees(a);
        System.out.println(i);

    }



    public int numTrees(int n) {

        if(n==0){
            return 0;
        }
        final int ts = getTs(1, n);
        return ts;
    }

    public int getTs(int s, int n){
        int index =0;
        if(s>n){
            return index;
        }
        for (int i=s;i<=n;i++){
            final int lts = getTs(s, i - 1);
            final int rts = getTs(i + 1, n);
            if(lts!=0 && rts !=0){
                index = index + ( lts * rts );
            }else if(rts ==0 && lts !=0){
                index = index +lts;
            }else if(lts ==0 && rts !=0){
                index = index +rts;
            }else{
                index = index+1;
            }
        }
        return index;

    }


}
