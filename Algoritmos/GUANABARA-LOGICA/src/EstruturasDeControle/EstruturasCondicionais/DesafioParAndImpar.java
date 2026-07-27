package EstruturasDeControle.EstruturasCondicionais;

import java.util.Scanner;

public class DesafioParAndImpar {
    public static void main(String[] args) {
        // Preciso pedir ao um usuário um número para eu contar
        // diante disso vou falar impar e par

        Scanner in = new Scanner(System.in);

        System.out.print("Me diga um número para iniciar a contagem: ");
        int numDigitado = in.nextInt();

        for (int i = 0; i <= numDigitado; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " é par");
            } else {
                System.out.println(i + " é impar");
            }
        }

    }
}
