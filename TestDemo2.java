/**
 * Created With IntelliJ IDEA.
 * Description:二分查找
 * User:ZouSS
 * Date:2020-08-25
 * Time:10:17
 **/
public class TestDemo2 {
    public static int binarySearch(int[] arr,int key){
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            int middle = (left+right)/2;
            if (key < arr[middle]){
                right = middle-1;
            }else if (key == arr[middle]){
                return middle;
            }else {
                left = middle+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {1,3,5,6,7,9};
        System.out.println(binarySearch(array,3));
    }
}
