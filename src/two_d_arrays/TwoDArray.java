package two_d_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int [][] arr=new int [2][3];
        int n=arr.length;
        int m=arr[0].length;
        initializeArray(arr, n, m);
        System.out.println(Arrays.deepToString(arr));

    }

    private static void initializeArray(int[][] arr, int n, int m) {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0; j<m; j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }

}
