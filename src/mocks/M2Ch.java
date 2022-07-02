package mocks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class M2Ch {
    public static void main(String[] args) {
        // int arr[] ={5,1,2,3,4};
        Queue<Integer> qe= new LinkedList<>();
        qe.add(5);
        qe.add(1);
        qe.add(2);
        // qe.add(6);
        qe.add(3);
        qe.add(4);
        if(ifSorted(qe)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }

    private static boolean ifSorted(Queue<Integer> qe) {
        Queue<Integer> q2= new LinkedList<>();
        Stack<Integer> st=new Stack<>();
        Integer temp=0;
        st.push(qe.remove());
        
        while(!qe.isEmpty()){
            temp = qe.remove();
            if(temp < st.peek()){
                q2.add(temp);
            }else{
                st.push(temp);
            }
        }
        while(!st.empty()){
            Integer temp1= st.pop();

            if(temp < temp1){
                q2.add(temp1);
                temp=temp1;
            }else{
                return false;
            }

        }
       
            return true;

    }
}
