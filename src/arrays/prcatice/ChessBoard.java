package arrays.prcatice;

import java.util.Scanner;

public class ChessBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter1 = 0, counter2 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = sc.nextInt();
                int x = (i + j) % 2;
                if (x == 1) {
                    counter1 += 1;
                } else {
                    counter2 += 1;
                }
            }
        }
        if (counter1 < counter2) {
            System.out.println(counter1);
        } else {
            System.out.println(counter2);
        }
    }

}
