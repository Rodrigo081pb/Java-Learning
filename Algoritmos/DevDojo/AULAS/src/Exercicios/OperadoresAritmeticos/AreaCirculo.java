package Exercicios.OperadoresAritmeticos;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        /*
        * Formulá :
        *
        * A = PI.R^2
        *
        * R = dado pelo usuário
        *
        * */

        Scanner input = new Scanner(System.in);

        System.out.println("Vamos calcular a área de um círculo \uD83D\uDC4D");
        System.out.println("Me diga o raio do circulo: ");
        int raio = input.nextInt();

        // ou seja aqui eu camo o pi e depois faço vezes a raio elevado ao quadrado
        double area = Math.PI * Math.pow(raio, 2);
        area = Math.round(area);
        System.out.println("A área é : " +area);


    }
}
