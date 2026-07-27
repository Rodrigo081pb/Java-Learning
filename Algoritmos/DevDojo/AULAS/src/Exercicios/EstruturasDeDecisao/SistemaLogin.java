package Exercicios.EstruturasDeDecisao;

import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        System.out.println("====================");
        System.out.println("=                  =");
        System.out.print("Digite seu nome: ");
        String nome = in.nextLine();
        if(nome.equals("") || nome.isBlank()){
            System.out.println("O nome de usuário não deve ser vázio ");
        } else {
            System.out.println("=                  =");
            System.out.println("Você deseja se cadastrar como um administrador? digite o número chave");
            int opcao = in.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Sim");
                    break;
                case 2:
                    System.out.println("Nao");
                    break;
                default:
                    System.out.println("Você errou o número chave então está completamente errado");
            };

            if (opcao == 1) {
                System.out.printf("Usuário %s cadastrado com sucesso %n", nome);
                System.out.printf("Você: %s é um administrador! 👍", nome);
            } else if (opcao == 2) {
                System.out.println("Usuário inválido!");
            }

            System.out.println("====================");
        }
    }
}
