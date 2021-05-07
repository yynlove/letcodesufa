package sf_math;

public class sf_633 {


    /**
     * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c
     * @param args
     */
    public static void main(String[] args) {
        final sf_633 sf_633 = new sf_633();
        final boolean b = sf_633.judgeSquareSum(5);
        System.out.println(b);
    }


    public boolean judgeSquareSum(int c) {
        int j = (int)Math.sqrt(c);
        int i=0;
        while (i<=j){
            int total = i*i+j*j;
            if(total>c){
                j--;
            }else if(total<c){
                i++;
            }else {
                return true;
            }
        }
        return false;
    }





}
