package arrays.prcatice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class EvenOddSorting {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 8, 3, 9 };
        int n = arr.length;
        
        // withNewArray(arr, n);
        Arrays.sort(arr);
        withoutNewArray(arr, n);
    }

    private static void withNewArray(int[] arr, int n) {
        int mid = n / 2;
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                a.add(arr[i]);
            } else {
                b.add(arr[i]);
            }
        }
        Collections.sort(a);
        Collections.sort(b, Collections.reverseOrder());
        // System.out.println(a);
        // System.out.println(b);

        for (int i = 0, j = 0, k = 0; i < n;) {
            if (i % 2 == 0) {
                arr[i++] = a.get(j++);
            } else {
                arr[i++] = b.get(k++);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void withoutNewArray(int[] arr, int n) {
        
        for (int i = 1; i < n-1; i+=2) {
            // System.out.println("i= " + i);
            int temp= arr[n-1];
            
            int j;
            for (j = n-1; j >i; j--) {
                // System.out.print(" j= "+ j);
                arr[j]= arr[j-1];
            }
            // System.out.println();
            arr[i]= temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }

    }
    
}
