package Exercicios.OperadoresAritmeticos;

public class VelocidadeMs {
    public static void main(String[] args) {
        /*
        * Formula:
        *
        * velocidade = (distancia * 1000) / (tempo * 60)
        *
        * */

        double distancia = 45.30;
        double tempo = 32;
        double velocidade =  (distancia * 1000) / (tempo *60);
        System.out.println("velocidade : " + velocidade + "ms");

    }
}
