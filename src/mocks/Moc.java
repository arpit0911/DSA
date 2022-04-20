package mocks;

import java.util.*;

public class Moc {
    public static void main(String[] args) {
        int arr[]= {1,3,5,4,1};
        int k= 5;
        
        // pairSum(arr, k);
        pairSumWithHashing(arr, k);
    }

    private static void pairSumWithHashing(int[] arr, int k) {
        int n=arr.length;
        HashSet<Integer> mp=new HashSet<Integer>();
        int currSum=0;


        for (int i = 0; i < n; i++) {
            currSum= k-arr[i];
            if(mp.contains(currSum)){
                System.out.println(arr[i] + " " + currSum);
                return;
            }
            mp.add(arr[i]);
        }
    }

    private static void pairSum(int[] arr, int k) {
        int n= arr.length;
        Arrays.sort(arr);
        int left=0;
        int right=n-1;

        while(left<right){
            if(arr[left]+ arr[right] ==  k){
                System.out.println(arr[left]+ " " + arr[right]);
                return;
            }else if(arr[left] + arr[right] < k){
                left++;
            }else{
                right++;
            }
        }
        
    }

}
