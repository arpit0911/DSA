package arrays.prcatice;

public class factorial {
    public static void main(String[] args) {
        long n=100;
        System.out.println(factorial(n));
    }

    private static long factorial(Long n) {
        if(n==0)
        return 1;
        else
        return (n* factorial(n-1));
    }
}
