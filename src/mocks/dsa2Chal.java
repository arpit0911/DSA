package mocks;

import java.util.LinkedList;
import java.util.Stack;

import javax.naming.spi.DirStateFactory.Result;

public class dsa2Chal {
    public static void main(String[] args) {
        // String str = "";
        // int res = longestValidParam(str);
        // System.out.println(res);
        int k=3;
        LinkedList<Integer> list =new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
// 1 2 3   4 5 6   7 8 9
// 3 2 1   4 5 6   9 8 7
        list=reverseKLL(list, k);
    }

    private static LinkedList<Integer> reverseKLL(LinkedList<Integer> list, int k) {
        int count=1;
        int initialCount=1;
        for(int i=0; i<list.size(); i++){
            if(count == k ){
                
                return null;
            }
        }
        return null;
    }

    private static int longestValidParam(String str) {
        int n = str.length();
        int res = 0;

        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '(') {
                st.push(i);
            } else {
                if (!st.empty()) {
                    st.pop();
                }
                if (!st.empty()) {
                    res = Math.max(res, i - st.peek());
                } else {
                    st.push(i);
                }
            }
        }
        return res;
    }
}
