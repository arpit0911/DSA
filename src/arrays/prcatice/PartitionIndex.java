package arrays.prcatice;

public class PartitionIndex {
    public static void main(String[] args) {
        int[] arr= {2,4,1,8,3};
        int n=arr.length;
        int l=0, r=n-1;
        int pi= partitionIndex(arr, l, r);
        System.out.println(pi);
    }

    private static int partitionIndex(int[] arr, int l, int r) {
        int pivot = arr[r];
        int i = l, j = l;
        while (i <= r) {
            if (arr[i] <= pivot) {
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
