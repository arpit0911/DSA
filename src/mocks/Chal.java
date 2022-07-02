package mocks;

import java.util.HashMap;

public class Chal {
    public static void main(String[] args) {
        int arr[]={1,1,3,2,3};
        uniqueNumber(arr);
    }

    private static void uniqueNumber(int[] arr) {
        int n=arr.length;
        HashMap<Integer, Integer> mp=new HashMap<>();

        for (int i = 0; i < n; i++) {
            if(mp.containsKey(arr[i])){
                Integer temp= mp.get(arr[i]);
                temp++;
                mp.put(arr[i], temp);
            }else{
                mp.put(arr[i], 1);
            }
        }

        for (int i = 0; i < n; i++) {
            if(mp.get(arr[i]) == 1){
                System.out.println(arr[i]);
                return;
            }
        }
    }
}
