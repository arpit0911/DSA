package two_d_arrays;

import javax.swing.text.html.FormView;

public class Searching {
    public static void main(String[] args) {
        int arr[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        int x = 7;
        int count = 0;
        int n = arr[0].length;
        int j=n-1, i=0;
        // System.out.println(arr[0].length);
        while (i<n && j>=0 ) {
            if(arr[i][j] == x){
                count=1;
                System.out.println(i + ", "+ j);
                break;
            }else if(x<arr[i][j]){
                j--;
            }else{
                i++;
            }
             
        }
        if(count==0){
            System.out.println("not found");
        }
       
        
        
        // for (int i = 0; i < n; i++) {
        //     int l = 0, r = n - 1;
        //     int mid = 0;
        //     while (l <= r) {
        //         mid = (l + r) / 2;
        //         if (arr[i][mid] == x) {
        //             count = 1;
        //             break;

        //         } else if (x >= arr[i][mid]) {
        //             l = mid + 1;
        //         } else {
        //             r = mid - 1;
        //         }
        //     }
        //     if (count == 1) {
        //         System.out.println(i + ", " + mid);
        //         break;
        //     }
        // }
        // if (count == 0) {
        //     System.out.println("not found");
        // }

    }

}
