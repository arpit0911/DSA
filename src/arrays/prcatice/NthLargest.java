package arrays.prcatice;

public class NthLargest {
    public static void main(String[] args) {
        int[] arr= {2,4,1,8,3,9};
        int n=arr.length;
        int k=5;


        kThLargestElement(arr, n, k);
    }

    private static void kThLargestElement(int[] arr, int n, int k) {
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]> arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
        System.out.println("kth largest Elemnt = " + arr[n-k]);
    }

    private static void swap(int[] arr, int j, int i) {
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]= temp;    
    }
}
