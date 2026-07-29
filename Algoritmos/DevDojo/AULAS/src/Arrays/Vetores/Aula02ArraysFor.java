package Arrays.Vetores;

import java.util.Scanner;

public class Aula02ArraysFor {
    public static void main(String[] args) {
        double[] notas = new double[4];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite uma nota: ");
            notas[i] = scanner.nextDouble();
        }

        double media = 0;
        for(int i = 0; i < notas.length; i++){
            media = media + notas[i];
            System.out.println(notas[i]);
        }

        System.out.println("Soma das notas " + media);
        System.out.println("Media das notas " + Math.round(media/notas.length));

    }
}
