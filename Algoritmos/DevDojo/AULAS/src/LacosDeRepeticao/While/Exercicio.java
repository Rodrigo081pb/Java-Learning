package LacosDeRepeticao.While;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continuar = true;

        do{
            System.out.println("USER 1 : Digite um número de 1 a 10");
            int num1 = input.nextInt();
            System.out.println("USER 2 : Digite outro número de 1 a 10");
            int num2 = input.nextInt();
            if(num1 == num2){
                System.out.println("você acertou");
            } else{
                System.out.println("Errou");
            }
            System.out.println("Deseja continuar ?  ");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            if(input.nextInt() == 1){
                continuar = true;
                System.out.println("Vamos continuar");
            } else {
                continuar = false;
                System.out.println("Paramos o jogo");
            }
        } while (continuar);
    }
}
