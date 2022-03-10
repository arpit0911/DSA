package arrays.sorting;

public class MockIn {
    public static void main(String[] args) {
        int [] arr={2,5,8,4,3,1,9,6};
        int n = arr.length;
         
        for(int i=0; i<n/2; i++){
            if(i%2==0){
                for(int j= i+2; j<n; j=j+2){
                    if(arr[j] < arr[j-2]){
                        swap(arr, arr[j], arr[j+2]);
                    }
                }
            }else{
                for(int j= i+2; j<n; j=j+2){
                    if(arr[j] > arr[j-2]){
                        swap(arr, arr[j], arr[j+2]);
                    }
                }

            }
        }

        for(int i=0; i<n; i++){
            System.out.println(arr[i]+ " ");
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
    }
}
