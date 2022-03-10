package two_d_arrays;

import java.util.Arrays;

public class MetrixMultiplication {
    public static void main(String[] args) {
        int [][] a={{1,1,1},{1,1,1},{1,1,1}};
        int [][] b={{1,1,1},{1,1,1},{1,1,1}};

        multiplyMatrix(a, b);
    }

    private static void multiplyMatrix(int[][] a, int[][] b) {
        if(a[0].length != b.length)
            return;
        
        int [][] c=new int[a.length][b[0].length];
        for(int i=0;i<c.length; i++){
            for(int j=0;j<c[0].length; j++){
                int k=0, res=0;
                while(k<b.length){
                    res+= a[i][k] * b[k][j];
                    k++;
                }
                c[i][j]= res;
            }
        }
        System.out.println(Arrays.deepToString(c));
    }

}
