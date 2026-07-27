package Exercicios.OperadoresAritmeticos;

public class CalculoLitroConsumo {
    public static void main(String[] args) {
        /*
        * Distancia = Tempo gasto na viagem * velocidade
        * LU = DISTANCIA / 12
        *
        * */

        // 120 será 2 horas
        // 40 será a velocidade por hora
        double distancia = 2 * 40;
        double lu = distancia / 12;
        System.out.println("Lu: " + Math.round(lu));

    }
}
