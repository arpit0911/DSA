package arrays.prcatice;

import java.util.Arrays;

public class CountDuplicates {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 2, 3,4 };
        int n = arr.length;
        int l=0, r=n-1;

        quickSort(arr, l, r);
        System.out.println(Arrays.toString(arr));
        int counter=1, i;
        for (i = 0; i < n-1;) {
            if(arr[i] == arr[i+1]){
                counter++;
                i++;
            }else{
                if(counter > 1)
                    System.out.println(arr[i] + " " + counter);
                counter=1;
                i++;
            }
            
        }
        if(counter > 1)
            System.out.println(arr[i] + " " + counter);
    }

    private static void quickSort(int[] arr, int l, int r) {
        if(l<r){
            int pi= partitionIndex(arr, l, r);
            quickSort(arr, l, pi-1);
            quickSort(arr, pi+1, r);
            
        }
    }

    private static int partitionIndex(int[] arr, int l, int r) {
        int pivot= arr[r];
        int i=l, j=l;
        while(i<=r){
            if(arr[i] <= pivot){
                if(i!=j){
                    swap(arr, i, j);
                } 
                j++;
            }
            i++;
        }
        return j-1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
    }
}
