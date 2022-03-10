package arrays.sorting;


public class SelectionSort {
    public static void main(String[] args) {
        int arr[]= {2, 5, 8, 4, 0, 1};
        int n=arr.length;
        selectionSortArray(arr, n);  
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    private static void selectionSortArray(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
            int minIndex= i;
            for (int j = i+1; j < n; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                swap(arr, minIndex, i);
            }
        }
    }

    private static void swap(int[] arr, int minIndex, int i) {
        int temp= arr[i];
        arr[i]=arr[minIndex];
        arr[minIndex]= temp;
    }
}
