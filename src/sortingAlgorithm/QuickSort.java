package sortingAlgorithm;

import java.util.Arrays;

/**
 * @author MikeWang
 * @date 2020/8/21 3:01 下午
 * 双指针解法 ->二分思想
 */
public class QuickSort {

    public static void quickSort(int[] arr,int start,int end){
        //递归停止条件
        if (start>=end){
            return;
        }
        //找到基准元素位置
        int pivotIndex = partition(arr, start, end);
        //分成两部分递归排序
        quickSort(arr, start, pivotIndex-1);
        quickSort(arr, pivotIndex+1, end);
    }

    private static int partition(int[] arr, int start, int end) {
        //取第一个位置的元素作为基准元素
        int pivot = arr[start];
        int left = start;
        int right = end;
        while (left!=right){
        //控制right指针比较并左移
            while (left<right&&arr[right]>pivot){
                right--;
            }
            //控制left指针比较并右移
            while (left < right&&arr[left]<=pivot){
                left++;
            }
            //交换left和right指向的元素
            if (left<right){
                int p = arr[left];
                arr[left] = arr[right];
                arr[right] = p;
            }
        }
        //pivot和指针重合点交换
        int p = arr[left];
        arr[left] = arr[start];
        arr[start] = p;
        return left;

    }

  public static void main(String[] args) {
    //
      int[] arr = {4,4,7,6,5,3,2,8,1};
    quickSort(arr, 0, arr.length-1);
    System.out.println(Arrays.toString(arr));
    Arrays.sort(arr);
  }
}
