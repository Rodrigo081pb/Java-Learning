package Arrays.Matrizes;

import java.util.Arrays;

public class ArrayMultidimencionais {
    public static void main(String[] args) {
        int[][] arrayMulti1 = new int[4][4];

        arrayMulti1[0][0] = 1;
        arrayMulti1[0][1] = 2;
        arrayMulti1[0][2] = 3;
        arrayMulti1[0][3] = 4;

        arrayMulti1[1][0] = 1;
        arrayMulti1[1][1] = 2;
        arrayMulti1[1][2] = 3;
        arrayMulti1[1][3] = 4;


        for(int i = 0; i < arrayMulti1.length; i++){
            System.out.println(i + " - VETOR 0 " + arrayMulti1[0][i] + "| VETOR 1 - " + arrayMulti1[1][i]);
        }

    }
}
