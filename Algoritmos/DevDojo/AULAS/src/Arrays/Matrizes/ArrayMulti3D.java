package Arrays.Matrizes;

public class ArrayMulti3D {
    public static void main(String[] args) {

        int[][][] triplas = new int[3][5][4];

        triplas[0][0][0] = 0;
        triplas[0][1][0] = 1;
        triplas[0][2][0] = 2;
        triplas[0][3][0] = 3;

        triplas[1][0][0] = 4;
        triplas[1][1][0] = 5;
        triplas[1][2][0] = 6;
        triplas[1][3][0] = 7;

        triplas[2][1][0] = 8;
        triplas[2][2][1] = 9;
        triplas[2][3][2] = 10;
        triplas[2][4][3] = 11;

        System.out.println("Array Posição Coluna Valor");

        for (int i = 0; i < triplas.length; i++) {
            for (int j = 0; j < triplas[i].length; j++) {
                for (int k = 0; k < triplas[i][j].length; k++) {

                    System.out.printf(" [%d]   [%d]   [%d]   =   %d%n",
                            i, j, k, triplas[i][j][k]);
                }
            }
        }
    }
}