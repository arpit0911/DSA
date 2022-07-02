package DSAthree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Fibonic {
    public static void main(String[] args) {

        int n = 2;
        // int max = 10000;
        // int dp[] = new int[max];
        // for (int i = 0; i < n; i++) {
        //     System.out.print(fibonacciSeriesWithDP(i, dp) + " ");
        // }

       tOfh(n, 'a', 'c', 'b');

    }
    // using Dynamic programming

    

    private static void tOfh(int n, char fromRod, char toRod, char desRod) {
        if(n==0){
            return;
        }

        tOfh(n-1, fromRod, desRod, toRod);
        System.out.println(fromRod + " - " + toRod );
        tOfh(n-1, desRod, toRod, fromRod);
    }



    private static int fibonacciSeriesWithDP(int n, int[] dp) {
        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        if (dp[n] != 0) {
            return dp[n];
        }
        dp[n] = fibonacciSeriesWithDP(n - 1, dp) + fibonacciSeriesWithDP(n - 2, dp);
        return dp[n];

    }

    // using recursion
    private static int fibonacciSeries(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciSeries(n - 2) + fibonacciSeries(n - 1);

        }
        // if( n== 1 || n==2){
        // return 1;
        // }
        // return fibonacciSeries(n-2) + fibonacciSeries(n-1);
    }

}
