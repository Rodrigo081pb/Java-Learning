package Livro.LivroAlgoritmo.Lista1;

import java.util.Scanner;

public class EnderecoTelefone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Me diga seu telefone: ");
        String telefone = input.nextLine();
        System.out.println("Me diga seu endereço");
        String endereco = input.nextLine();

        System.out.println("Seu número é: "+ telefone);
        System.out.println("Seu endereço é: "+ endereco);
    }
}
