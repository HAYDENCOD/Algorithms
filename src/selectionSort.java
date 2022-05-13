public class selectionSort {
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int maxIndex = 0;
            for (int j = 0; j < arr.length - 1 -i; j++) {
                if (arr[j] < arr[j +1]){
                    maxIndex = j;
                }
            }
            int temp;
            if (maxIndex != i){
                temp = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = temp;
            }
        }
    }
}
