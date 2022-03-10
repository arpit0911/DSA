package arrays.prcatice;

public class DTriplet {
    public static void main(String[] args) {
        int [] arr= {1,3,2,5,9};
        int n=arr.length;
        int l=0, r=n-1;
        int p=4;
        quickSort(arr, l, r);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+ " ");
        // }
        countDTriplets(arr, n, p);
    }

    private static void countDTriplets(int[] arr, int n, int p) {
        int count= 0;
        for(int i=0;i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n;k++){
                    // System.out.print(arr[i]+ ", "+ arr[j]+ ", "+ arr[k]);
                    // System.out.println();
                        int sub1=arr[k]- arr[j];
                        int sub2= arr[k]- arr[i];
                        int sub3= arr[j]- arr[i];
                        if(sub1 <= p && sub2 <= p && sub3 <= p){
                            count++;
                        }
                }
                // System.out.println();
            }
        }
        System.out.println("count= " + count);
    }

    private static void quickSort(int[] arr, int l, int r) {
        if(l>r) return;
        int pi=partisionIndex(arr, l, r);
        quickSort(arr, l, pi-1);
        quickSort(arr, pi+1, r);
    }

    private static int partisionIndex(int[] arr, int l, int r) {
        int pivot= arr[r];
        int i=l, j=l;
        while(i <=r){
            if(arr[i]<= pivot){
                if(i!=j){
                    swap(arr, i,j);
                }
                j++;
            }
            i++;
        }
        return j-1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }
}
