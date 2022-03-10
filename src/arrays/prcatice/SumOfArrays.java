package arrays.prcatice;

import java.util.Arrays;

public class SumOfArrays {
    public static void main(String[] args) {
        int[] a = { 9,9,9,9 };
        int[] b = {  9,9,9,9 };
        int[] ans=new int[Math.max(a.length, b.length)];
        int i=a.length-1;
        int j=b.length-1;
        int k=ans.length-1;
        int sum, carry=0;
        while(i>=0 || j>=0){
            sum=0;

            if(i>=0){
                sum+=a[i];
                i--;
            }
            if(j>=0){
                sum+=b[j];
                j--;
            }
            sum +=carry;
            carry=sum/10;
            int lastDigit=sum%10;
            ans[k--]=lastDigit;
        }
        if(carry != 0){
            int[] newAns= new int[ans.length+1];
            newAns[0]=carry;
            for (int l = 1; l < newAns.length; l++) {
                newAns[l] = ans[l-1];
            }
                System.out.print(Arrays.toString(newAns));
        }
        
        
    }
}
