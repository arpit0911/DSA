package arrays.searching;

public class TernarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int size = arr.length;
        int k = 5;
        int l = 0, r = size - 1;
        System.out.println(ternarySearch(arr, size, k));
        System.out.println(recTernarySearch(arr, l, r, k));
    }

    public static int recTernarySearch(int arr[], int l, int r, int k) {
        if (l <= r) {
            int partition = (r - l) / 3;
            int m1 = l + partition;
            int m2 = r - partition;
            // System.out.println(l+ " ,"+r+", "+ partition+", "+m1+", "+ m2);

            if (k == arr[m1]) {
                return m1;
            } else if (k == arr[m2]) {
                return m2;
            } else if (k < arr[m1]) {
                return recTernarySearch(arr, l, m1 - 1, k);
            } else if (k > arr[m2]) {
                return recTernarySearch(arr, m2 + 1, r, k);
            } else {
                return recTernarySearch(arr, m1 + 1, m2 - 1, k);
            }
        }
        return -1;
    }

    public static int ternarySearch(int arr[], int size, int k) {
        int l = 0, r = size - 1;

        while (l <= r) {
            int partition = (r - l) / 3;
            int m1 = l + partition;
            int m2 = r - partition;

            if (k == arr[m1]) {
                return m1;
            } else if (k == arr[m2]) {
                return m2;
            } else if (k <= arr[m1]) {
                r = m1 - 1;
            } else if (k > arr[m2]) {
                l = m2 + 1;
            } else {
                l = m1 + 1;
                r = m2 - 1;
            }
        }
        return -1;
    }
}
