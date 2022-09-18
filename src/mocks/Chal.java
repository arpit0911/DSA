package mocks;

public class Chal {
    public static void main(String[] args) {
        int arr[] = { 5,4,3,2,1 };
        int n = arr.length;
        int element = 4;
        // int l = 0;
        // int r = n - 1;

        // quckSort(arr, l, r);
        // for (int i = 0; i < n; i++) {
        // System.out.print(arr[i] + " ");
        // }
        binarySearch(arr, n, element);
    }

    private static void binarySearch(int[] arr, int n, int element) {
        int l = 0, r = n - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (element == arr[mid]) {
                System.out.println("found at index= " + mid);
                return;
            } else if (element < arr[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        System.out.println("Element not found");
    }

    private static void quckSort(int[] arr, int l, int r) {
        if (l < r) {
            int pi = partitionIndex(arr, l, r);
            quckSort(arr, l, pi - 1);
            quckSort(arr, pi + 1, r);
        }
        // return;

    }

    private static int partitionIndex(int[] arr, int l, int r) {
        int pivot = arr[r];
        int i = l, j = l;

        while (i <= r) {
            if (arr[i] >= pivot) {
                if (i != j) {
                    swap(arr, i, j);
                }
                j++;
            }
            i++;
        }
        return j - 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
