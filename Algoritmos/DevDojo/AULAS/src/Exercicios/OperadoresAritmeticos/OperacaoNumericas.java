package Exercicios.OperadoresAritmeticos;

import java.util.Scanner;

public class OperacaoNumericas {
    static void Operacoes(int num1,int num2){

        System.out.printf("%s + %s é: %s %n", num1, num2, num1+num2 );
        System.out.printf("%s - %s é: %s %n", num1, num2, num1-num2 );
        System.out.printf("%s x %s é: %s %n", num1, num2, num1*num2 );
        System.out.printf("%s / %s é: %s %n", num1, num2, num1/num2 );

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Para começarmos me diga 2 numeros");

        System.out.println("Digite o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        Operacoes(num1,num2);


    }

}
