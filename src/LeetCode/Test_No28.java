package LeetCode;

/**
 * 实现 strStr() 函数。
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 */
public class Test_No28 {

    public int strStr(String haystack, String needle) {
        int res = -1;
        int len = needle.length();
        int lenhay = haystack.length();
        if (lenhay<len){
            return -1;
        }
        int start = 0;
        int end = len-1;
        while (end<lenhay){
            if (haystack.substring(start,end+1).equals(needle)){
                return start;
            }
            end++;
            start++;
        }
        return -1;
    }

}
