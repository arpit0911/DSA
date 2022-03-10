package string;

public class ToggleCase {
    public static void main(String[] args) {
        String str= "abcABC";
        // String res=toggleCase(str);
        // System.out.println(res);
        strConversion(str);
        
    }
// * doubt clearing
    private static void strConversion(String str) {
        int n=str.length();
        for (int i = 0; i < n; i++) {
            char c=str.charAt(i);
            System.out.println("c= " + c);

            // int newt= (int)'2' - '0';

            // int newt = (int) (c- '0');
            int newt= Integer.parseInt(str);
            System.out.println("newt= " + newt);

        }
    }
// * toggle case
    private static String toggleCase(String str) {
        int n=str.length();
        String ans= "";
        for (int i = 0; i < n; i++) {
            char c=str.charAt(i);
            if(c >= 'a' && c<= 'z'){
                char newCrr= (char)(c + 'A'- 'a');
                ans+= newCrr;
            }else{
                char newCrr= (char)(c + 'a'- 'A');
                ans+= newCrr;
            }
        }
        return ans;
    }
}
