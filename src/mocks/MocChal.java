package mocks;

import java.util.Arrays;

public class MocChal {
    public static void main(String[] args) {
        int arr1[]= {3,3,7};//number of seats in cars
        int arr2[]= {1,2,4};// number of people

        getMinCar(arr1, arr2);
        
    }

    private static void getMinCar(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int m=arr2.length;
        int totalPeople= 0;

        for (int i = 0; i < m; i++) {
            totalPeople +=arr2[i];
        }
        Arrays.sort(arr1);
        int j;
        for (j = 0; j < totalPeople; j++) {
            totalPeople -= arr1[j];
        }
        System.out.println("min cars= " + j);
    }

}
