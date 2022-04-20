package oops.stack;

import java.util.Scanner;
import java.util.Stack;

public class EvalExp {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // sc.nextLine();
        // String str = sc.nextLine();
        String str = "4 13 5 / +";

        System.out.println(evaluateExp(str));

    }

    public static int evaluateExp(String str) {
        int n = str.length();
        // System.out.println(n);

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            // System.out.println("i= " + i);
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                st.push(c - '0');
                // System.out.println(c - '0');

            } else {
                if(c == ' '){
                    continue;
                }
                int num1 = st.pop();
                int num2 = st.pop();

                switch (c) {
                    case '+':
                        st.push(num2 + num1);
                        break;

                    case '-':
                        st.push(num2 - num1);
                        break;

                    case '*':
                        st.push(num2 * num1);
                        break;

                    case '/':
                        st.push(num2 / num1);
                        break;
                }
            }
            // System.out.println(st.peek());
        }
        // if(!st.isEmpty())
        return st.pop();

    }
}