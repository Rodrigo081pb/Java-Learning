package Exercicios.LacosDeRepeticao.While;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner ler = new Scanner(System.in);
        while(opcao != 3){
            System.out.println("Digite uma das opções abaixo");
            System.out.println(
                    "======================\n" +
                    "         MENU         \n" +
                    "1 - Calcular imposto\n" +
                    "2 - Depositar Salário\n" +
                    "3 - Calcular imposto\n"
            );
            opcao = ler.nextInt();
            if (opcao == 3){
                System.out.println("Fim do Menu3");
            }
        }

    }
}
