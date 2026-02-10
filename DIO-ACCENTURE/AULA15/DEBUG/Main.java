package AULA15.DEBUG;

import AULA15.DEBUG.MODELS.MenuOption;
import AULA15.DEBUG.MODELS.UserModel;

import java.util.Scanner;

public class Main {

    private static UserModel dao = new UserModel();

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao cadastro de pessoas!");
        System.out.println("1 - Cadastrar pessoa física");
        System.out.println("2 - Atualizar");
        System.out.println("3 - Deletar");
        System.out.println("4 - Buscar por ID");
        System.out.println("5 - Listar todas as pessoas");
        System.out.println("6 - Sair");

        var inputOption = scanner.nextInt();

        while (true){
            var selectectedOption = MenuOption.values()[inputOption-1];
            switch (selectectedOption){
                case SAVE:
                    System.out.println("Cadastrando pessoa física...");
                    break;
                case UPDATE:
                    System.out.println("Atualizando pessoa...");
                    break;
                case DELETE:
                    System.out.println("Deletando pessoa...");
                    break;
                case FIND_BY_ID:
                    System.out.println("Buscando pessoa por ID...");
                    break;
                case FIND_ALL:
                    System.out.println("Listando todas as pessoas...");
                    break;
            }
        }

    }

}
