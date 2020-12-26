package sortingAlgorithm;

/**
 * @author MikeWang
 * @date 2020/11/16 11:21 下午
 *
 * 先比较target 和左右两边 进行一次排序,确保左边的数字比target小 右边的数据比target大
 */
public class QuickSort2 {

    //交换
    public static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void quickSort2(int[] arr, int startIndex, int endIndex){
        int start = startIndex, end = endIndex, target = arr[startIndex];
        if (arr!=null&&arr.length > 0){
            while (start>end){
                return;
            }
            while (start < end){
                //从右向左比较
                while (start<end){
                    if (arr[end]<target){
                        swap(arr, start, end);
                        break;
                    }else {
                        end--;
                    }
                }

                while (start < end){
                    if (arr[start]>target){
                        swap(arr, start, end);
                        break;
                    }else {
                        start++;
                    }
                }
                //target 左边还有元素继续递归
                if (target-1>startIndex){
                    quickSort2(arr, startIndex, start-1);
                }
                if (target+1<endIndex){
                    quickSort2(arr, end+1, endIndex);
                }

            }
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,1,8,5,3,2,9,10,6,7};
        quickSort2(arr,0,9);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }

}
