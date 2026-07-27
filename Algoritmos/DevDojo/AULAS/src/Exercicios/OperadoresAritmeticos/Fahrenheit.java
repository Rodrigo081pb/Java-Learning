package Exercicios.OperadoresAritmeticos;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        /*
        * Conversão de celcius para fahrenheit
        *
        * Fórmula: f = (9 * c) / 5
        *
        * */

        Scanner input = new Scanner(System.in);
        System.out.println("Me informe quantos graus está fazendo na sua residencia em C°: ");
        int celsius = input.nextInt();

        int fahrenheit = celsius * 5/9;

        /*
        * Conversão reversa
        *
        * Fórmula:
        *
        * C = ((F - 32) * 5) / 9
        *
        * */

        celsius = ((fahrenheit - 32) * 5/9);

        System.out.println("Fahrenheit :" + fahrenheit);
        System.out.println("Celsius :" + celsius);


    }
}
