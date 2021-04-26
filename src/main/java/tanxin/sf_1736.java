package tanxin;

public class sf_1736 {


    /**
     * 给你一个字符串 time ，格式为 hh:mm（小时：分钟），其中某几位数字被隐藏（用 ? 表示）。
     *
     * 有效的时间为 00:00 到 23:59 之间的所有时间，包括 00:00 和 23:59 。
     *
     * 替换 time 中隐藏的数字，返回你可以得到的最晚有效时间。
     * @param args
     */
    public static void main(String[] args) {
        String time = "0?:3?";
        final sf_1736 sf_1736 = new sf_1736();
        final String s = sf_1736.maximumTime(time);
        System.out.println(s);

    }



    public String maximumTime(String time) {
        final char[] chars = time.toCharArray();
        for (int i=0;i<chars.length;i++){
            if(chars[i] == '?'){
                if(i == 0 && (chars[1]<'3'|| chars[1]== '?')){
                   chars[i]='2';
                }else if(i ==0){
                    chars[i]='1';
                }else if(i == 1 && (chars[0]=='2')){
                    chars[i]='3';
                }else if(i==1){
                    chars[i] = '9';
                }else if(i == 3){
                    chars[i]='5';
                }else if(i == 4){
                    chars[i]='9';
                }
            }
        }

        return String.valueOf(chars);


    }


}
