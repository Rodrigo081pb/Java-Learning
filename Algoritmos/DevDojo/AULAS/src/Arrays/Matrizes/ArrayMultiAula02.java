package Arrays.Matrizes;

public class ArrayMultiAula02 {
    public static void main(String[] args) {
        int[][] triplas = new int[2][3];

        triplas[0][0] = 0;
        triplas[0][1] = 1;
        triplas[0][2] = 2;

        triplas[1][0] = 4;
        triplas[1][1] = 5;
        triplas[1][2] = 6;

        // basicamente temos array posição e valor show
        System.out.println("Array  Posição  Valor");
        for(int i = 0; i < triplas.length; i++){
            for(int j = 0; j < triplas[i].length; j++){
                System.out.printf("L: [%s]  [%s]  [%s] %n",  i, j, triplas[i][j]);
            }
        }

    }
}
