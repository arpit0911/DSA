package mocks;

import java.util.HashMap;

import javax.swing.plaf.synth.SynthDesktopIconUI;

import arrays.sorting.MergeSort;

public class MocI {
    public static void main(String[] args) {
        // int arr[]= {1,12,2,7,3};
        // int n=arr.length;
        String s1= "arpit";
        String s2= "artip";

        forAnagram(s1,s2);

        // int res[] =mergeS(arr, 0, n-1);
        // for (int i = 0; i < res.length; i++) {
        //     System.out.print(res[i] + " ");
        // }
    }

    private static void forAnagram(String s1, String s2) {
        if(s1.length() == s2.length()){
            int n=s1.length();

            HashMap <Character,Integer> mp= new HashMap<>();
            HashMap <Character,Integer> mp2= new HashMap<>();
            for (int i = 0; i < n; i++) {
                char c= s1.charAt(i);
                if(mp.containsKey(c)){
                    Integer temp= mp.get(c);
                    temp++;
                    mp.put(c, temp);
                }else{
                    mp.put(c, 1);
                }
            }
            for (int i = 0; i < n; i++) {
                char c= s2.charAt(i);
                if(mp2.containsKey(c)){
                    Integer temp= mp2.get(c);
                    temp++;
                    mp2.put(c, temp);
                }else{
                    mp2.put(c, 1);
                }
            }
            for (int i = 0; i < n; i++) {
                char c= s1.charAt(i);
                if(mp.get(c) != mp2.get(c)){
                   System.out.println("not anagram");
                   return;
                }
            }
            System.out.println("anagram");
            
        }else{
            System.out.println("not anagram");
        }
    }

    private static int [] mergeS(int[] arr, int start, int end) {
        if(start == end){
            // int res[] = new int[1];
            // res[0]= arr[start];
            return arr;
        }
        int mid= (start+end)/2;
        int arr1[]= mergeS(arr, start, mid);
        int arr2[]=mergeS(arr, mid+1, end);

        return mergeSort(arr1, arr2);

    }

    private static int[] mergeSort(int[] arr1, int[] arr2) {
        int i=0, j=0, k=0;
        int result[] =new int[arr1.length + arr2.length];
        while(i<arr1.length && j< arr2.length){
            if(arr1[i] <= arr2[j]){
                result[k++]= arr1[i++];
            }else{
                result[k++]= arr2[j++];
            }
        }
        while(i<arr1.length){
            result[k++]=arr1[i++];
        }
        while(j<arr2.length){
            result[k++] = arr2[j++];
        }
        return result;
    }
}
