package Exercicios.Arrays.Vetores;

public class CarrosMaisBaratos {
    public static void main(String[] args){
        Double [] vetor = {
              18.800,
              19.900,
              20.000,
              28.000,
              50.500,
        };

        Double maiorValor = vetor[0];
        Double menorValor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
            }

            if (vetor[i] < menorValor) {
                menorValor = vetor[i];
            }
        }

        System.out.println("Maior Valor: "+ maiorValor);
        System.out.println("Menor Valor: "+ menorValor);

    }
}
