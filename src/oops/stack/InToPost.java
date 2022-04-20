package oops.stack;

import java.util.Stack;

public class InToPost {
    public static void main(String[] args) {
        String str= "*-A/BC-/AKL";
        System.out.println(convert(str));
    }

    public static boolean isOperator(char x){
        switch(x){
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
            case '%':
                return true;
        }
        return false;
    }

    private static String convert(String str) {
        int n=str.length();
        Stack<String> st=new Stack<>();

        for(int i= n-1; i>=0; i--){
            char c=str.charAt(i);
            if(isOperator(c)){
                String op1= st.pop();
                String op2= st.pop();

                String temp= "(" + op1 + c + op2 + ")";
                st.push(temp);
            }else{
                st.push(c+"");
            }

        }

        return st.pop();
    }
}
