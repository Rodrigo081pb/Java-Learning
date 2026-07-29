package LacosDeRepeticao.For;

import java.util.Scanner;

public class Aula02Exercicio2 {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        System.out.print("Número para tabuada: ");
//        int numeroTabuada = input.nextInt();

//        for (int i = 0; i <= 10; i++){
//            int resultado = i * i;
//            System.out.printf("%s X %s é: %s %n", i, numeroTabuada, resultado);
//        }


        // Agora quero fazer para todos números de 1 até 10
        for (int i = 0; i <= 10; i++) {
            System.out.println("Tabuada do " + i);
            for (int j = 1; j <= 10; j++) {
                int tabuada = i * j;
                System.out.printf("%s X %s = %s %n",i,j,tabuada);
            }
        }

    }
}
