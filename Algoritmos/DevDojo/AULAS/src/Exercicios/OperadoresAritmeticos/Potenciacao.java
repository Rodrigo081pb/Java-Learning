package Exercicios.OperadoresAritmeticos;

public class Potenciacao {
    public static void main(String[] args) {
        int valor = 2;
        double valorAoQuadrado =  Math.pow(valor,2);
        double valorAoCubo =  Math.pow(valor,3);
        double valorElevadoDecimaPotencia =  Math.pow(valor,10);

        System.out.printf("%s elevado ao quadrado é : %s %n", valor, valorAoQuadrado);
        System.out.printf("%s elevado ao cubo é : %s %n", valor, valorAoCubo);
        System.out.printf("%s elevado a decima potência é : %s %n", valor, valorElevadoDecimaPotencia);

        double soma = valorAoQuadrado + valorAoCubo + valorElevadoDecimaPotencia;
        System.out.println("soma: " + soma);

    }
}
