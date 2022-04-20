package mocks;

import java.util.HashMap;

public class mi {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1, 1, 10, 10, -15, 3, 2 };
        // {1,2,3, 4, 5}
        // {1,2}
        // 6
        subsrrSunK(arr);

    }

    // * sub array with sum == k
    private static void subsrrSunK(int[] arr) {
        int n = arr.length,
                start = 0,
                currsum = 0,
                sum = 5,
                size = 0,
                end = -1;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            currsum += arr[i];

            if (currsum - sum == 0) {
                start = 0;
                end = i;
                size = (end - start) + 1;
                System.out.println("found subarray " + start + " " + end + " " + "size " + size);

                // break;
            }
            if (hm.containsKey(currsum - sum)) {
                start = hm.get(currsum - sum) + 1;
                end = i;
                size = (end - start) + 1;
                System.out.println("found subarray " + start + " " + end + " " + "size " + size);

                // break;
            }
            hm.put(currsum, i);

        }
        if (end == -1) {
            System.out.println("not found");
        }
        // else {
        // System.out.println("found at " + start + " " + end);
        // }
    }
}

// find the ocurances of all the charachter in the string
// s=aabbccdfabc
// a:3 output:-a3b3c3d1f1
// b:3
// c:3
// d:1
// f:1
