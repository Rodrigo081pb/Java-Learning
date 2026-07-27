package Vetores;

import java.util.Arrays;
import java.util.Scanner;

public class vetores {
    public static void main(String[] args) {

        // =================== PESQUISA BINÁRIA

        int []vetor = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int pesquisador = Arrays.binarySearch(vetor, 5);

        // for each para percorrer o vetor
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }

        System.out.println(pesquisador);

        // =========================================================================
        //  => Treinando com vetores
        //
        //
        // - Tamanho do vetor ? apenas utilizamos o .length

        int []n = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("total de casas de N " + n.length);


        for(int c = 0; c<=n.length;c++){
            System.out.printf("Na posição %s temos o valor %s %n", c,n[c]);
        }

        String []mes = {
                "Janeiro",
                "Fevereiro",
                "Março",
                "Abril",
                "Maio",
                "Junho",
                "Julho",
                "Agosto",
                "Setembro",
                "Outubro",
                "Novembro",
                "Dezembro"
        };

        int []dia = {31,28,31,30,31,30,31,31,30,31,30,31};

        // conferindo se no mês de fevereiro o valor dele é 29 para identificar um ano bissexto
        if(dia[1] == 29){
            System.out.println("O ano é bissexto");
        } else {
            System.out.println("O ano é normal kkkk");
        }

        // Uso do length
        for(int i =0; i < mes.length; i++){
//          Aqui é como se ele tivesse iterando sobre cada item da lista
            System.out.printf("O mês %s tem %s dias %n", mes[i],dia[i]);
        }

//        aqui a gente consegue somar valores de dentro de uma lista
        int ano = Arrays.stream(dia).sum();
        System.out.println("Um ano tem " + ano + " dias" );

        // Atribuindo valores
        int num[] = new int[2]; // vetor
        num[0] = 1;  // atribuindo o 1 na posição 0
        num[1] = 2;  // atribuindo o 1 na posição 0


        // ==================================================================

        int []numeros = {1,2,3,4};

        System.out.println(Arrays.toString(numeros)); // imprimir a lista

        // Imprimir valores pares de dentro de uma lista e contar eles tipo existem 2 numeros pares na saída saca ?

        for (int i = 0; i <numeros.length; i++){
            if(numeros[i]%2==0){
                System.out.print("Número PAR:");
                System.out.println(numeros[i]);
            } else {
                System.out.print("Número IMPAR");
                System.out.println(numeros[i]);
            }
        };

        int []numerosList = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(numerosList));

        int totalPares = 0;
        int totalImpares = 0;

        int []pares = new int[numerosList.length];
        int []impares = new int[numerosList.length];
        int indicePar = 0;
        int indiceImpar = 0;

        for (int numero : numerosList) {
            if (numero % 2 == 0) {
                pares[indicePar] = numero;
                indicePar++;
                totalPares++;
            } else {
                impares[indiceImpar] = numero;
                indiceImpar++;
                totalImpares++;
            }
        }

        for (int i = 0; i < indicePar; i++) {
            System.out.println("Números pares: " + pares[i]);
        }

        System.out.println("");

        for (int i = 0; i < indiceImpar; i++) {
            System.out.println("Números impares " + impares[i]);
        }

        System.out.println("total pares : " + totalPares);
        System.out.println("total impares " + totalImpares);

        for(int i = 0; i < numerosList.length; i++){
            if(numerosList[i]%2==0){
                totalPares++;
            } else {
                totalImpares++;
            }
        }
        System.out.printf("total de números pares foi de %s %n",  totalPares);
        System.out.printf("total de números impares foi de %s %n",  totalImpares);

    }
}
