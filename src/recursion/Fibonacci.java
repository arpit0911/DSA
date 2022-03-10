package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        fibo(5);
    }

    static int n1=0, n2=1, n3=0;
    public static void fibo(int n){
        if(n>0) {
            if(n1==0) {
                System.out.println(n1);
                System.out.println(n2);
            }
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
            fibo(n-1);

        }
    }
}
