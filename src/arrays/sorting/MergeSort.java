package arrays.sorting;

public class MergeSort {
    // ** Time-->O(nlogn) Space-->O(n)
    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 1, 6, 1, 7, 8, 5 };
        int n = arr.length;
        int l = 0, r = n - 1;
        int res[] = mgSort(arr, l, r);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    private static int[] mgSort(int[] arr, int l, int r) {
        if (l == r) {
            int[] res = new int[1];
            res[0] = arr[l];
            return res;
        }
        int mid = (l + r) / 2;
        int lArr[] = mgSort(arr, l, mid);
        int rArr[] = mgSort(arr, mid + 1, r);
        return mergeSortedArray(lArr, rArr);
    }

    private static int[] mergeSortedArray(int[] lArr, int[] rArr) {
        int i = 0, j = 0, k = 0;
        int n = lArr.length;
        int m = rArr.length;
        int[] res = new int[n + m];
        while (i < n && j < m) {
            if (lArr[i] < rArr[j]) {
                res[k++] = lArr[i++];
            } else {
                res[k++] = rArr[j++];
            }
        }
        while (i < n) {
            res[k++] = lArr[i++];
        }
        while (j < m) {
            res[k++] = rArr[j++];
        }
        return res;
    }

    // * same as above
    // private static int[] mgSort(int[] arr, int l, int r) {
    // if(l == r){
    // int[] res=new int[1];
    // res[0]= arr[l];
    // return res;
    // }
    // int mid= (l+r)/2;
    // int [] lArr= mgSort(arr, l, mid);
    // int [] rArr= mgSort(arr, mid+1, r);
    // return mergeTwoArray(lArr, rArr);
    // }

    // private static int[] mergeTwoArray(int[] arr1, int[] arr2) {
    // int n=arr1.length;
    // int m=arr2.length;
    // int [] res= new int[n+m];
    // int i=0,j=0,k=0;
    // while(i<n && j<m){
    // if(arr1[i]< arr2[j]){
    // res[k++]= arr1[i++];
    // }else{
    // res[k++]=arr2[j++];
    // }
    // }
    // while (i<n) {
    // res[k++]= arr1[i++];
    // }
    // while (j<m) {
    // res[k++]= arr2[j++];
    // }
    // return res;
    // }
}
