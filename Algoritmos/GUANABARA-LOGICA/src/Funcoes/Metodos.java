package Funcoes;

import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Digite um numero: ");
//        int num1 = input.nextInt();
//        System.out.println("Digite outro numero: ");
//        int num2 = input.nextInt();
//
//        soma(num1,num2);

        int sm = soma1(1,2);
        System.out.println(sm);

    }

    // função retorna um valor
    static int soma1(int a, int b){
        return a+b;
    }

    // método
    static void soma(int b, int a){
        int s = a + b;
        System.out.println(s);
    };



}
