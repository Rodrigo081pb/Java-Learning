package ControleDeFluxo;

public class Aula1 {
    public static void main(String[] args) {
        int idade = 17;
        String s = idade > 18 ? "adulto" : "de menor"; // operador ternário
        System.out.println(s);

        /*
        * Isso é o mesmo que :
        *
        * if(idade>18){
        *   System.out.print("De maior");
        * } else {
        *   System.out.print("De menor");
        * }
        *
        *
        * */



    }
}
