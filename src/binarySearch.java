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
    public static void linearSearch(int[] arr, int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key){
                System.out.println("found");
            }
        }
    }
    public static void main(String[] args) {
int[] a = {1,2,3,4,5,6,3,4,6,22,5,4,2,42,55,32};
Arrays.sort(a);
        for (int menu: a) {
            System.out.print(menu + " ");
        }
        System.out.println(" ");
binarySearchs(a, 5);
        System.out.println(" ");
        linearSearch(a,5);

    }
}
