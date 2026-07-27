package Exercicios.LacosDeRepeticao.While;

import java.util.Scanner;

public class LoginWhile {
    public static void main(String[] args) {

        int opcao = 0;
        String usuario = "rodrigo";
        String senha = "123";
        Scanner ler = new Scanner(System.in);

        while(opcao != 1){
            System.out.println(
                "MENU DE LOGIN\n" +
                "DIGITE O USUÁRIO E SENHA E PARA CONFIRMAR DIGITE 1\n"
            );
            System.out.println("USUÁRIO : ");
            usuario = ler.nextLine();
            System.out.println("SENHA : ");
            senha = ler.nextLine();
            if(usuario.equals(usuario) && senha.equals(senha)){
                System.out.println("1 - confirmar");
                System.out.println("2 - cancelar");
                opcao = ler.nextInt();
                if(opcao == 1){
                    System.out.println("Acesso concebido");
                } else if(opcao == 2){
                    System.out.println("Saindo do login");
                    opcao = 0;
                }
            } else {
                System.out.println("Acesso negado");
            }
        }
    }
}
