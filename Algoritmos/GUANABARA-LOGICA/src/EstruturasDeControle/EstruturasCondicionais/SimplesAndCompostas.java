package EstruturasDeControle.EstruturasCondicionais;

import java.util.Scanner;

public class SimplesAndCompostas {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Me diz tua primeira nota ai: ");
        int a = in.nextInt();
        System.out.println("Me diz tua segunda nota ai:");
        int b = in.nextInt();
        System.out.println("Me diz tua terceiro nota ai:");
        int c = in.nextInt();
        System.out.println("Me diz tua quarta nota ai:");
        int d = in.nextInt();

        int media = (a+b+c+d)/4;

        if(media < 6 && media > 4){
            System.out.println("Deu ruim boy vai pra final");
        } else if (media > 6 && media < 8){
            System.out.println("Passou raspando");
        } else if (media > 8) {
            System.out.println("Parabéns! ta aprovado");
        } else {
            System.out.println("Reprovou");
        }


    }
}
