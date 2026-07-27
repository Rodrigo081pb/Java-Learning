package ControleDeFluxo;

import java.util.Scanner;

public class Aula3 {
    public static void main(String[] args) {
    // Desafio 1: dado um determinado numero inteiro imprima se ele é impar ou par
        Scanner scanner =  new Scanner(System.in);
        int numero = scanner.nextInt();

        if(numero % 2 == 0){
            System.out.printf("%s é par", numero);
        } else {
            System.out.printf("%s é impar", numero);
        }
    }
}
