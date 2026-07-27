package Exercicios.OperadoresAritmeticos;

public class VolumeLata {
    public static void main(String[] args) {
        /*
        *  V = pi*r^2 * a
        *
        * V = volume
        * pi = 3,14
        * Raio = Circuferencia da lata
        * A = altura da lata
        *
        * O volume deve ser apresentado com a unidade de medida correto cm^3
        *
        * */


        double raioCircuferencia = 7;
        double altura = 3.25;
        double volume = Math.PI * Math.pow(raioCircuferencia, 2) * altura;

        System.out.printf("Volume: %.2f cm³%n", volume);


    }
}
