package arrays.subArray;

public class SumAllSub {
    // **** the task is to calculate the sums of all subArrays of size K. **
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int k = 3;
        sumAllSubArraySizeK(arr, k);
        sumAllSubArraySizeKWithSlidingWindow(arr, k);
    }

    // ** naive approach time--> O(N*K) space--> O(1).
    private static void sumAllSubArraySizeK(int arr[], int k) {
        int n = arr.length;

        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            for (int j = i; j < k + i; j++) {
                sum += arr[j];
            }
            System.out.print(sum + " ");
        }
    }

    // ** sliding window approach time O(n) space O(1)
    private static void sumAllSubArraySizeKWithSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        System.out.print(sum + " ");

        for (int i = k; i < n; i++) {
            sum = (sum - arr[i - k] + arr[i]);
            System.out.print(sum + " ");
        }
    }

}
