package Exercicios;

public class TrocaVariaveisPegadinha {

    static void trocarVariaveis(int x, int y){
        if(x != y){
            int temp = x;
            x = y;
            y = temp;
            System.out.println("Trocando variaveis");
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        }
    }


    public static void main(String[] args) {
        int x = 2;
        int y = 5;

        System.out.println("X: " + x);
        System.out.println("Y: " + y);

        trocarVariaveis(x, y);

    }
}
