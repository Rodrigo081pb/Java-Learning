package Exercicios.Arrays.Vetores;

import java.util.Arrays;

public class MediaElementos {
    public static void main(String[] args) {
        int [] dados = {1,2,3,4,5,6,7,8};

        int media = Arrays.stream(dados).sum() / dados.length;
        System.out.println("A média é: " + media);

        System.out.println("números maiores que a média");
        for (int i = 0; i<dados.length; i++){
            if(dados[i] > media){
                System.out.print(dados[i]+" ");
            }
        }

    }
}
