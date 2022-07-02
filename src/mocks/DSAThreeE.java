package mocks;

public class DSAThreeE {
    public static void main(String[] args) {
        String str = "abc";
        String ans = "";

        allPermutation(str, ans);

    }

    private static void allPermutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            String lString = str.substring(0, i);
            String rString = str.substring(i + 1);
            String res = lString + rString;
            allPermutation(res, ans + ch);
        }
    }

}
