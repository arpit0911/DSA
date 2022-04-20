package mocks;

import java.util.*;

public class mokI {
    public static void main(String[] args) {
        // 1 3 5 3 7
        //
        // String str = "arpitsingh";
        // int size = 5;
        // uniqueSubString(str);
        // ababac
        // a 4
        // b 3
        // c 5
        int arr[] = { 11, 13, 21, 3 };
        // findNextGreater(arr);
        findNextGreaterStack(arr);
    }

    private static void findNextGreaterStack(int[] arr) {
        int n=arr.length;
        int res[] =new int[n];
        Stack<Integer> st=new Stack<>();

        for(int i=n-1; i>=0; i--){
            if(!st.empty()){
                while(!st.empty() && st.peek() <= arr[i]){
                    st.pop();
                }
            }
            res[i]= st.empty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(res[i]+ " ");
        }
    }

    // * https://www.geeksforgeeks.org/find-the-longest-substring-with-k-unique-characters-in-a-given-string/
    private static void uniqueSubString(String str) {
        int n=str.length();
        HashMap<Character, Integer> mp=new HashMap<>();

        for (int i = 0; i < n; i++) {
            char c=str.charAt(i);
            mp.put(c, i);
        }
        // String s2=
        // K V
        // ! implement queue using stack 
        /*
        1 3 5 7 
        dq()- 1 
        dq()- 2
        inque() 3->  5 7 3
        st1- 1 2 3 

        kadane's algorithm // for sliding window



        impliment stack with two queues

        */
        // start end winSize startSize 
    }
// * https://www.geeksforgeeks.org/next-greater-element/
    private static void findNextGreater(int[] arr) {
        int n = arr.length;
        boolean flag;
        for (int i = 0; i < n; i++) {
            flag = false;
            if (i == n - 1) {
                arr[n - 1] = -1;
            } else {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] > arr[i]) {
                        arr[i] = arr[j];
                        flag = true;
                        break;
                    }
                }
            }

            if (flag == false) {
                arr[i] = -1;
            }

        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}
