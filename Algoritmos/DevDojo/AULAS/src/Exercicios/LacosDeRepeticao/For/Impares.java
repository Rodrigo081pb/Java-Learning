package Exercicios.LacosDeRepeticao.For;

import java.util.Scanner;

public class Impares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int i = 1; i <= num; i = i + 2){
            System.out.println(i);
        }

    }
}
