public class bubbleSort {
    public static void bubbleSort(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp;
                if (arr[j] > arr[j +1]){
                    temp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j + 1]  = temp;
                }
            }
        }
    }
}
