package sortingAlgorithm;

import java.util.Arrays;

/**
 * @author MikeWang
 * @date 2020/8/21 10:13 上午
 */
public class BubbleSort {

  public static void main(String[] args) {
    //
      int[] array = {0, 1, 2, 11, 4, 5, 6};
      int tmp;
      //记录是否发生替换 0没有 1有
      int isChange;
      //记录执行次
      int num = 0;
    for (int i = 0; i < array.length-1;i++) {
      //
        isChange =0;
      for (int j = 0; j < array.length-i-1; j++) {
        //
          if (array[j]>array[j+1]){
              tmp = array[j];
              array[j] = array[j+1];
              array[j+1] = tmp;
              //发生置换
              isChange = 1;
          }
      }
      if (isChange == 0) {
          break;
      }
      num++;
    }
    System.out.println(Arrays.toString(array));
  }
}
