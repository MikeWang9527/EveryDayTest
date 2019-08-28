package LeetCode;

import java.util.Arrays;

public class Test_No242 {
    /**
     * 法一：排序
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1,str2);

    }

    /**
     * 哈希表 计数器
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram2(String s, String t) {
      if (s.length()!=t.length()){
          return false;
      }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i)-'a']++;
            counter[t.charAt(i)-'a']--;
        }
        for (int count:counter) {
            if (count!=0){
                return false;
            }
        }
        return true;
    }
}
