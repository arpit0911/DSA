package arrays.prcatice;

public class KCircleSum {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 2, 3,4 };
        int n = arr.length;
        int k=2;
        
        for (int i = 0; i < n; i++) {
            while(k>0){
                
            }
            for (int j = i; j < k; j++) {
                System.out.print(" " + arr[j] + " " + arr[j+1] + " ");
            }
            System.out.println();
        }
    }
}
