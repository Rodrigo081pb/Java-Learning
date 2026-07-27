package Exercicios.EstruturasDeDecisao;

import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia = scanner.nextInt();

        if(dia == 1){
            System.out.println("domingo");
        } else if(dia == 2){
            System.out.println("segunda");
        } else if(dia == 3){
            System.out.println("terça");
        } else if (dia == 4) {
            System.out.println("quarta");
        } else if (dia == 5) {
            System.out.println("quinta");
        } else if (dia == 6) {
            System.out.println("sexta");
        } else {
            System.out.println("Esse dia não existe paizão");
        }

    }
}
