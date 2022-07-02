package mocks;

import java.util.Stack;

public class MocH {
    public static void main(String[] args) {
        int arr[] = { 11, 13, 21, 3 };
        nextGreater(arr);  //* next  greater number

    }

    private static void nextGreater(int[] arr) {
        int n = arr.length;
        int res[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            if (!st.empty()) {
                while (!st.empty() && st.peek() <= arr[i]) {
                    st.pop();
                }

            }
            res[i] = st.empty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
