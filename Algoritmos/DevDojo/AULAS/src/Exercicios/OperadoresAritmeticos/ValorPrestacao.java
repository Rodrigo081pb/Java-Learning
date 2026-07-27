package Exercicios.OperadoresAritmeticos;

public class ValorPrestacao {
    public static void main(String[] args) {
        /*
        * Prestação: Valor + (valor * ( taxa / 100 ) * tempo
        * */

       double valor = 280.58;
       int tempoEmDias = 30;
       double taxa = 0.04 * 100;
       double prestacao = valor + (valor *(taxa /100) * tempoEmDias);
       System.out.println("valor da prestação RS" + Math.round(prestacao));


    }
}
