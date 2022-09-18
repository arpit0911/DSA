package arrays.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = arr.length;
        int element = 1;

        System.out.println("found at index= " + BinarySearchIndex(arr, element, n));
    }

    private static int BinarySearchIndex(int[] arr, int element, int n) {
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (element == arr[mid]) {
                return mid;
            } else if (element > arr[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    private static void binarySearch(int[] arr, int element) {
        int n = arr.length;

        int l = 0, r = n - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == element) {
                System.out.println("found");
                return;
            } else if (element > arr[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

    }
}
