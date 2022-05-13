public class linearSearch {
    public static void linearSearch(int[] arr, int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key){
                System.out.println("Found");
            }
        }
    }
}
