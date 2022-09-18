package arrays.subArray;

public class KCircularSum {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6};
        int k=2;
        kCircularSum(arr, k);
    }

    private static void kCircularSum(int[] arr, int k) {
        int arrSize=arr.length;
        int sum=0;

        for(int i=0;i<k;i++){
            sum +=arr[i];
        }
        System.out.print(sum + " ");

        for (int i = k; i < (arrSize+k)-1; i++) {
            sum =(sum - arr[i-k]) + arr[i%arrSize];
            System.out.print(sum + " ");
        }
    }
}
