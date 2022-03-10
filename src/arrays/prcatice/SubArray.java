package arrays.prcatice;

import java.util.ArrayList;

public class SubArray {
    public static void main(String[] args) {
        int[] arr = {1, -2, 4, -5, 1};
        int n = arr.length;
        // ArrayList<Integer> list= new ArrayList<>();
        int sum=0;
        int count=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0, l=n-i-1; j < i + 1; j++, l++) {
                for (int k = j; k <= l; k++) {
                    // System.out.print(arr[k] + " ");
                    sum+= arr[k];
                    
                }
                // System.out.println("sum= "+ sum);
                if(sum < 0){
                    count++;
                }
                sum=0;
            }
        }
        System.out.println("count= " + count);

    }
}
