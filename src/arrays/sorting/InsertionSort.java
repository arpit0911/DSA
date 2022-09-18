package arrays.sorting;


public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={3,6,1,8,4};
        int n= arr.length;
        inSort(arr, n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    private static void inSort(int[] arr, int n) {
        for(int i=0;i<n;i++){
            for(int j=i; j>=1; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr,j, j-1);
                }else  break;
            }
        }
    }
    private static void swap(int[] arr, int j, int i) {
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
    }
}
