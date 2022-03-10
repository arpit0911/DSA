package arrays.searching;


public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = arr.length;
        int element = 11;
        System.out.println("found at index= " + LinearSearchIndex(arr, element, n));
    }

    private static int LinearSearchIndex(int[] arr, int element, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
