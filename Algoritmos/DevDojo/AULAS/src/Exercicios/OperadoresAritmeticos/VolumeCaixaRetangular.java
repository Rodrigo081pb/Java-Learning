package Exercicios.OperadoresAritmeticos;

public class VolumeCaixaRetangular {
    public static void main(String[] args) {
        /*
        * Volume = Comprimento * Largura * Altura
        *
        * */

        double comprimento = 50.60;
        double largura = 45.70;
        double altura = 1.90;

        double volume = comprimento * largura * altura;
        System.out.println("Volume: " + Math.round(volume) + "cm³");
    }
}
