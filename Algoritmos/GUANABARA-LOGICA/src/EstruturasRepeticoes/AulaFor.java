package EstruturasRepeticoes;

import java.util.Scanner;

public class AulaFor {
    // contador de cambalhota
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Quantas cambalhotas você quer dar ? ");
        int cambalhota = input.nextInt();

        // i = 0 que é o valor inicial ai temos a condicional e depois temos o efeito
        for(int i = 0; i < cambalhota; i++){
            System.out.printf("você deu: %s cambalhotas %n", i);
        };

    }

}
