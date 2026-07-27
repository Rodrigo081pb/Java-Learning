package ControleDeFluxo.Swith;

import java.util.Scanner;

public class JurosConta {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o tipo de conta? : ");
        System.out.println(
                "1 - Conta Poupança\n" +
                "2 - Conta Corrente\n" +
                "3 - Conta Investimento\n"
                +"Escolha uma opção: "
        );
        int tipoConta = ler.nextInt();
        switch (tipoConta) {
            case 1:
                System.out.println("0.05% de Juros");
                break;
            case 2:
                System.out.println("0.02% de Juros");
                break;
            case 3:
                System.out.println("0.01% de Juros");
                break;
            default:
                System.out.println("Opção inválida");
        }

    }
}
