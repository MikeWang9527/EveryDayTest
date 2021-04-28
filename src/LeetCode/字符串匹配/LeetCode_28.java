package LeetCode.字符串匹配;

/**
 * @author MikeWang
 * @date 2021/4/28 4:10 下午
 * 给定一个haystack字符串和一个needle字符串,在haystack字符串中找出needle字符串出现的第一个位置(从0开始)。如果不存在.
 * 则返回-1
 */
public class LeetCode_28 {
    public int strStr(String haystack,String needle){
        int haylen = haystack.length();
        int needlen = needle.length();
        //特殊情况
        if (haylen<needlen){
            return -1;
        }
        if (needlen==0){
            return 0;
        }
        //主串
        for (int i = 0; i < haylen-needlen+1; ++i) {
            int j;
            //模式串
            for (j = 0; j < needlen; j++) {
                //不符合直接跳出，主串指针向后移一位
                if (haystack.charAt(i+j) != needle.charAt(j)){
                    break;
                }
            }
            //匹配成功
            if (j == needlen){
                return i;
            }
        }
        return -1;
    }
}
