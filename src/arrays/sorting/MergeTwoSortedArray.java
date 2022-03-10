package arrays.sorting;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8};
        int n=arr1.length;
        int m=arr2.length;
        
        int [] res= mergeTwoArray(arr1, arr2, n, m);
        for(int i=0; i<res.length;i++){
            System.out.print(res[i]+ " ");
        }

    }

    private static int[] mergeTwoArray(int[] arr1, int[] arr2, int n, int m) {
        int [] res= new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(arr1[i]< arr2[j]){
                res[k++]= arr1[i++];
            }else{
                res[k++]=arr2[j++];
            }
        }
        while (i<n) {
            res[k++]= arr1[i++];
        }
        while (j<m) {
            res[k++]= arr2[j++];
        }
        return res;
    }
}
