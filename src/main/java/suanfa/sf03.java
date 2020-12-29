package suanfa;

import java.util.*;

public class sf03 {

    public static void main(String[] args) {

        String s="";
        final sf03 sf03 = new sf03();
        final int i = sf03.lengthOfLongestSubstring2(s);


    }

    /**
     * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
     *
     *
     *
     * 示例 1:
     *
     * 输入: s = "abcabcbb"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {

        final char[] chars = s.toCharArray();
        HashSet<Character> characters = new HashSet<Character>();
        int a=0;
        for (int z=0;z<chars.length;z++){
            for ( int i=z;i<chars.length;i++){
                if(characters.contains(chars[i])){
                    a= Math.max(a, characters.size());
                    characters.clear();

                }
                characters.add(chars[i]);
            }
            a= Math.max(a,characters.size());
            characters.clear();
        }

        return a;
    }



    public int lengthOfLongestSubstring2(String s){

        //开始位置
        int start=0;
        //存储每个字符串的最后位置
        int size =0;
        //map 存储已经遍历过的每个字符串最后的位置
        final HashMap<Character, Integer> endWz = new HashMap<Character, Integer>();
        for (int i=0;i<s.length();i++){
            final char c = s.charAt(i);
            //不存在这添加此此字符串的位置
            if(!endWz.containsKey(c)){
                endWz.put(c,  -1);
            }
            //开始计算字符串不同的位置
            start = Math.max(start,endWz.get(c)+1);
            //字符串最大长度
            size = Math.max(size,i- start+1);
            endWz.put(c,i);
        }
        return size;
    }


    public int lengthOfLongestSubstring1(String s) {
            // 记录字符上一次出现的位置
            int[] last = new int[128];
            for(int i = 0; i < 128; i++) {
                last[i] = -1;
            }
            int n = s.length();

            int res = 0;
            int start = 0; // 窗口开始位置
            for(int i = 0; i < n; i++) {
                int index = s.charAt(i);
                start = Math.max(start, last[index] + 1);
                res   = Math.max(res, i - start + 1);
                last[index] = i;
            }

            return res;

    }


}
