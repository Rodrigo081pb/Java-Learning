package Arrays.Matrizes;

public class ArrayMutiAula03 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        matriz[0][0] = 22;
        matriz[0][1] = 11;
        matriz[0][2] = 4;

        matriz[1][0] = 44;
        matriz[1][1] = 55;
        matriz[1][2] = 9;

        matriz[2][0] = 2;
        matriz[2][1] = 5;
        matriz[2][2] = 21;


        int resultadoMultiplicacaoArrays = 1;
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                System.out.printf("[%s] [%s]  [%s] %n",i,j,matriz[i][j]);
                if(i == j){
                    resultadoMultiplicacaoArrays = resultadoMultiplicacaoArrays * matriz[i][j];
                }
            }
        }

        System.out.println("Resultado Multiplicacao Arrays: " + resultadoMultiplicacaoArrays);

    }
}
