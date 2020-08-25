import java.util.Arrays;

/**
 * Created With IntelliJ IDEA.
 * Description:快速排序
 * User:ZouSS
 * Date:2020-08-25
 * Time:8:49
 **/
public class TestDemo {
    public static void quickSort(int[] arr,int left,int right){
       if (left >= right){
           return;
       }
       int i = left;
       int j = right;
       int key = arr[left];
       while(i < j){
           while(arr[j] >= key && i<j){
               j--;
           }
           while(arr[i] <= key && i<j){
               i++;
           }
           if (i < j){
               int tmp = arr[i];
               arr[i] = arr[j];
               arr[j] = tmp;
           }
       }
       arr[left] = arr[i];
       arr[i] = key;
       quickSort(arr,left,i-1);
       quickSort(arr,i+1,right);
    }
    public static void main(String[] args) {
        int[] arr = {1,5,6,2,3,99};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


}
