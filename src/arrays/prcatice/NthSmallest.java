package arrays.prcatice;

public class NthSmallest {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 8, 3, 9 };
        int n = arr.length;
        int k = 6;

        kThSmallestElement(arr, n, k);
    }

    private static void kThSmallestElement(int[] arr, int n, int k) {
        for (int i = 0; i < k; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            swap(arr, minIndex, i);

        }
        System.out.println("kth smallest element = " + arr[k-1]);
    }

    private static void swap(int[] arr, int minIndex, int i) {
        int temp=arr[minIndex];
        arr[minIndex]= arr[i];
        arr[i]=temp;
    }
}
