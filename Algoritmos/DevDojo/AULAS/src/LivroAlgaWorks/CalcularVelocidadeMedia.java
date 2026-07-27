package LivroAlgaWorks;

import java.util.Scanner;

public class CalcularVelocidadeMedia {
    public static void main(String[] args) {
        Scanner inp =  new Scanner(System.in);
        System.out.println("Olá :)");
        System.out.print("Me diga a sua distância percorrida: ");

        double distanciaPercorrida =  inp.nextDouble();
        System.out.printf("Minha distância percorrida foi de %.1f", distanciaPercorrida);

        System.out.print("Em quantas horas você demorou pra percorrer ? ");
        double tempoGasto = inp.nextDouble();
        System.out.printf("Seu tempo gasto foi %.1f horas %n", tempoGasto);


        double velocidadeMedia = distanciaPercorrida / tempoGasto;

        System.out.printf("Interessante, a velocidade média que você obteve foi de : %n %.1f", velocidadeMedia);

    }
}
