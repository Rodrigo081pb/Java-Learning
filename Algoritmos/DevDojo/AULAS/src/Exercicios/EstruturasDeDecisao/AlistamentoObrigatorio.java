package Exercicios.EstruturasDeDecisao;

import java.util.Scanner;

public class AlistamentoObrigatorio {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("| Sistema de alistamento obrigatório    |");
        System.out.println("|                                       |");
        System.out.println("| Seja bem-vindo ao alistamento!        |");
        System.out.println("|                                       |");
        System.out.print("| Me informe seu nome: ");
        String nome = in.nextLine();

        System.out.print("| Me informe seu sexo:                    ");
        System.out.println("| M = Masculino ou F Feminino          |");
        System.out.print("Digite aqui: ");
        String sexo = in.nextLine();

        System.out.print("| Me informe sua idade: ");
        int idade = in.nextInt();

        System.out.println("|                                       |");
        System.out.println("|               CARREGANDO              |");
        System.out.println("|                                       |");

        String result;
        if(sexo.equals("m") || sexo.equals("M") && idade == 18 ){
            result = "RESULTADO : Alistamento obrigatório semana que vem você começa";
            System.out.println(result);
        } else if (sexo.equals("m") || sexo.equals("M") && idade < 18 ) {
            result = "RESULTADO : Alistamento não permitido";
            System.out.println(result);
        } else if (sexo.equals("f") || sexo.equals("F") && idade == 18 ) {
            result = "RESULTADO : Você deseja se alistar ? ";
            System.out.printf("%s responda | S = Sim ou N = Não ", result,nome);
            String opcao = in.nextLine();
            switch (opcao) {
                case "S":
                    System.out.printf("O alistamento da candidata %s foi concluído com sucesso", nome);
                    break;
                case "N":
                    System.out.printf("Ok pode ir para casa %s", nome);
                    break;
                default:
                    System.out.println("Valor Errado!");
            }
        } else if (nome.isBlank() || nome.isEmpty() ) {
            System.out.println("O seu nome não pode ser vázio");
        } else if (idade == 0) {
            System.out.println("Não pode ser 0");
        }

        System.out.println("========================================");


    }
}
