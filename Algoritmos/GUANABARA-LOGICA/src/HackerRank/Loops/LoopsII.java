package HackerRank.Loops;

import java.util.Scanner;

public class LoopsII {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {

            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();


            // aqui basicamente eu estou salvando dentro de um for 2 valores sendo A = 0 & b = 2
            int soma = a;
            int incremento = b;

            System.out.println("valor de A: "+a);
            System.out.println("valor de B|Incremento: "+ incremento);

            for (int j = 0; j < n; j++) {

                soma += incremento;
                System.out.print(soma);

                if (j < n - 1) {
                    System.out.print(" ");
                }

                incremento *= 2;
            }

            System.out.println();
        }

    }
}
