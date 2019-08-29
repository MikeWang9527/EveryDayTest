package LeetCode;

/**
 * 验证回文串
 */
public class Test_No125 {
    //双指针
    public boolean isPalindrome(String s) {
        if(s==null){
            return false;
        }
        if (s.length()==0){
            return true;
        }
        int i = 0;
        int j = s.length()-1;
        while (i<j){
            while (i<j&&Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while (i<j&&Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if (Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                i++;
                j--;
            }
        }
        return true;
    }
}
