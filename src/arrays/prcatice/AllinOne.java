package arrays.prcatice;

public class AllinOne {
    public static void main(String[] args) {
        int arr[] = { 3, 9, 5, 8, 4, 7, 2 };
        int n = arr.length;
        int k = 10;
        int l=0;
        int r=n-1;
        // LSearching(arr, n, k);
        // BSearching(arr,n,k);
        // selectionS(arr, n);
        // bubbleS(arr, n);
        // insertionS(arr, n);
        quickS(arr, l, r);
        displayArray(arr, n);
    }



    private static void quickS(int[] arr, int l, int r) {
        if(l>=r) return;
        int pi= pivotIndex(arr, l, r);
        quickS(arr,  l, pi-1);
        quickS(arr,  pi+1, r);
    }



    private static int pivotIndex(int[] arr, int l, int r) {
        int i=l, j=l;
        int pivot = arr[r];
        while(i<=r){
            if(arr[i] <= pivot){
                if(i != j){
                    swap(arr, i, j);
                }
                j++;
            }
            i++;
        }
        return j-1;
    }



    // ****************insertion sort
    private static void insertionS(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 1; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    // ******************* bubble sort
    private static void bubbleS(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    // ***********Selection sort
    private static void selectionS(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int ind = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[ind]) {
                    ind = j;
                }
            }
            swap(arr, i, ind);
        }
    }

    // ************ display array
    private static void displayArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // ***************** swapping
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // *********** Binary searching
    private static void BSearching(int[] arr, int n, int k) {
        int l = 0;
        int r = n - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == k) {
                System.out.println("Found at index= " + mid);
                return;
            } else if (k < arr[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        System.out.print("not found");
    }

    // ********** linear search
    private static void LSearching(int[] arr, int n, int k) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                System.out.print("found k" + "index=" + i);
                return;
            }
        }
        System.out.println("not found");
    }
}
