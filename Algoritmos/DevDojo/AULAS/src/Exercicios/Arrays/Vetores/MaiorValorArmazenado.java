package Exercicios.Arrays.Vetores;

public class MaiorValorArmazenado {
    public static void main(String[] args) {
        int [] vetor = {1,2,3,4,5,7,8,9,10};

        int maiorValor = 0;
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] > maiorValor){
                System.out.println(vetor[i]);
                maiorValor = vetor[i];
            } else {
                System.out.println(vetor[i]);
            }
        }

        System.out.println("Maior Valor: "+ maiorValor);
    }
}
