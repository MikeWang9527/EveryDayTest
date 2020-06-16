package LeetCode;

/**
 * @Author MikeWang
 * @Date 2020/6/16 6:29 下午
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个队列计算所有元素出现的次数
 */
public class Test_ListCount {

    public static  void A(){
        int arr[]={1,2,3,1,2,4,6,87,4,3,8,9,3,2,46,7};
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i])!=null){
                map.put(arr[i],map.get(arr[i])+1);
            }else {
                map.put(arr[i],1);
            }

        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
            System.out.println(entry.getKey()+"次数:"+entry.getValue());
        }
        
    }

    public static void main(String[] args) {
        A();
    }
}
