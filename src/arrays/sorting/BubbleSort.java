package arrays.sorting;


public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 8, 4, 0, 1 };
        int n=arr.length;
        bubbleSortArray(arr, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void bubbleSortArray(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
            
        }
    }
    private static void swap(int[] arr, int minIndex, int i) {
        int temp= arr[i];
        arr[i]=arr[minIndex];
        arr[minIndex]= temp;
    }
}
