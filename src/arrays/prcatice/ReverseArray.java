package arrays.prcatice;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr= {2,4,1,8,3,9};
        int n=arr.length;

        reverseArray(arr, n);
        
    }

    private static void reverseArray(int[] arr, int n) {
        for (int i = 0; i < n/2; i++) {
            int temp= arr[i];
            arr[i]=arr[n-1-i];
            arr[n-i-1]= temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
