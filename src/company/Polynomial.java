package company;

import java.util.Scanner;

public class Polynomial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        polynomialSum(a, n, m);

    }

    private static void polynomialSum(int[][] a, int n, int m) {
        if (n <= 0) {
            // return array[];
        }
        if (m <= 0) {
            // return arr[];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                
            }
        }
    }
}