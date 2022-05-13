import java.util.Arrays;

public class binarySearch {
    public static void binarySearchs(int[] arr, int key){
        if(arr.length == 1){
            System.out.println(arr[0]);
        }
        int left = 0;
        int right = arr.length;
        int mid = left + (left +right)/2;
        while(true){
            if (arr[mid] ==key){
                System.out.println("the index of the key " + key + " is at index " + mid);
                break;
            }else if(key > arr[mid]){
                left+=1;
            } else if (key < arr[mid]) {
                right -= 1;
            }
        }

    }

}
