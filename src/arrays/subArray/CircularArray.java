package arrays.subArray;

public class CircularArray {
    public static void main(String[] args) {
        int arr[] = { 6, 4, 3, 4, 1 };
        int k = 3;
        // circularArray(arr, k);
        circularKSum(arr, k);
    }

    private static void circularArray(int[] arr, int k) {
        int n = arr.length;

        for (int i = k; i < n + k; i++) {
            System.out.print(arr[i % n]);
        }
    }

    private static void circularKSum(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        System.out.print(sum + " ");
        // 3%6=3 3-3=0
        // 4%6=4 4-3
        // 5%6=5 5-3
        // 6%6=0 6-3
        // 7%6=1 7-3
        // 8%6=2 8-3
        // 9%6=3 9-3
        for (int i = k; i < (n + k)-1; i++) {
            sum = (sum - arr[i - k]) + arr[i % n];
            System.out.print(sum + " ");
        }

    }
}
