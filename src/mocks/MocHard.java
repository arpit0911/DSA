package mocks;

import java.util.Stack;

public class MocHard {

    public static void main(String[] args) {
        String str = "a+(b)+(c+d)";
        validBracket(str);
    }

    private static void validBracket(String str) {
        int n = str.length();
        Stack<Character> st = new Stack<>();

        boolean flag = false;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            // if(ch == '('){
            // st.push(ch);
            // }
            if (ch == ')') {
                while (st.peek() != '(') {
                    char c = st.peek();
                    if (c == '+' || c == '-' || c == '*' || c == '/') {
                        flag = true;
                        // break;
                    }

                    st.pop();
                }
                if (st.peek() == '(' && flag != true) {
                    System.out.println("false");
                    return;
                }

            }
            st.push(ch);

        }
        if (flag == true) {
            System.out.println("true");
        }
    }
}
