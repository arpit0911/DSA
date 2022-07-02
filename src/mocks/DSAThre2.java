package mocks;

import java.util.ArrayList;

public class DSAThre2 {
    public static void main(String[] args) {
        String str = "ara";
        String ans="";
        // reversString(str);
        // int n=9;
        // int dp[] =new int[n+1];
        // // 0 1 1 2 3 5
        // System.out.println(fibonnicNumber(n, dp));

        int arr[] = { -3,  0, -2, -7,-3 };
        separateNumber(arr);

        pallendromRecursive(str, ans);
    }
    private static void pallendromRecursive(String str, String ans) {

        if(str.length() == 0){
            return;
        }

        ans+= str.charAt(str.length()-1);
        pallendromRecursive(str, ans);

    }
    // -2,-7
    // -3,
    // 0,-3
    private static void separateNumber(int[] arr) {
        ArrayList<Integer> pos= new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        ArrayList<Integer> zero=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                zero.add(arr[i]);
            }
            if(arr[i] >0){
                pos.add(arr[i]);
            }
            if(arr[i] <0){
                if(neg.size() % 2 !=0){
                    neg.add(arr[i]);
                }else{
                    zero.add(arr[i]);
                }
            }
            
        }
        // for (int i = 0; i < pos.size(); i++) {
            
        // }

        System.out.println(pos);
        System.out.println(neg);
        System.out.println(zero);

    }

    private static int fibonnicNumber(int n, int[] dp) {
        dp[0] = 0;
        dp[1] = 1;
        // if(dp[n] != 0 ){
        // return dp[n];
        // }
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];

        }
        return dp[n];
    }

    private static void reversString(String str) {
        if (str.length() <= 1) {
            System.out.print(str + " ");
            return;
        } else {
            char ch = str.charAt(str.length() - 1);
            System.out.print(ch);
            reversString(str.substring(0, str.length() - 1));
        }

    }
}

// for (int i = 0; i < str.length(); i++) {
// char ch=str.charAt(0);
// String lString= str.substring(0, 1);
// String rString= str.substring(2);
// ans= rString + lString;

// reversString(rString, ans);

// }

// {1,1,2,-3,5-9,4}
// {1*1*2*}