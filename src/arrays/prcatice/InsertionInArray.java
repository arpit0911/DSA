package arrays.prcatice;

public class InsertionInArray {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 8, 3, 9 };
        int n = arr.length;
        int position = 3, value = 7;

        insertInSame(arr, n, value, position);
        System.out.println();
        insertionInNew(arr, n, value, position);
        // for (int i = 0; i < n; i++) {
        // System.out.print(arr[i]+ " ");
        // }

    }

    // * Insertion with new array of size n+1
    private static void insertionInNew(int[] arr, int n, int value, int position) {
        int[] newAr = new int[n + 1];
        int j = 0, i = 0;
        while (j < n + 1) {
            if (j == position) {
                newAr[j++] = value;
            } else {
                newAr[j++] = arr[i++];
            }
        }
        for (int k = 0; k < n + 1; k++) {
            System.out.print(newAr[k] + " ");
        }
    }

    // * Insertion by removing the last element
    private static void insertInSame(int[] arr, int n, int value, int position) {
        for (int i = position; i < n; i++) {
            int temp = arr[i];
            arr[i] = value;
            value = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
