package Exercicios.Arrays.Vetores;

import java.util.Scanner;

public class BuscaElemento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] listinha = {1,2,3,4,5};
        System.out.println("Me diga um número: ");
        int num = input.nextInt();
        for(int i = 0; i < listinha.length; i++){
            for(int j = 0; j < listinha.length; j++){
                if(listinha[i] == num){
                    System.out.println("Ele existe");
                    System.out.println("Está na posição " + i);
                    break;
                }
            }
        }
    }
}
