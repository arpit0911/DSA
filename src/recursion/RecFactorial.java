package recursion;

public class RecFactorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    private static int fact(int n) {
        if(n>1)
            n=n*fact(n-1);
        return n;
    }
}
