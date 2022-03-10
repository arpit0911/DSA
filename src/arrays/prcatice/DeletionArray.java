package arrays.prcatice;

public class DeletionArray {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 8, 3, 9 };
        int n = arr.length;
        int position = 3;
        // deletionInSame(arr, n, position);
        deletionInNew(arr, n, position);
    }

    private static void deletionInNew(int[] arr, int n, int position) {
        int m=n-1;
        int[] newAr=new int[m];
        int i=0, j=0;
        while(j<n){
            if(j == position){
                j++;
            }else{
                newAr[i++] =arr[j++];
            }

        }
        for (int k = 0; k < m; k++) {
            System.out.print(newAr[k] + " ");
        }
    }

    private static void deletionInSame(int[] arr, int n, int position) {
        for (int i = position; i < n-1; i++) {
            arr[i] =arr[i+1];
            arr[i+1] -= arr[i+1];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
