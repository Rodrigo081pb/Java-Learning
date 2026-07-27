package Exercicios.OperadoresAritmeticos;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        /*
        * Fórmula:
        *
        * Salario base = horas trabalhadas * valor hora de trabalho
        * Total de descontos = (Percentual de desconto / 100) * Salario Base
        * Salario liquido = Salario Base - Total de descontos
        *
        * */

        Scanner input = new Scanner(System.in);

        System.out.println("Vamos calcular inicialmente seu salário base: ");
        System.out.print("Me informe suas horas trabalhadas: ");
        int horasTrab = input.nextInt();
        System.out.println("");
        System.out.println("Me informe o valor de suas horas trabalhadas: ");
        int valorHorasTrab = input.nextInt();
        double percentDesconto = 0.12 * 100;

        int salarioBase = valorHorasTrab * horasTrab;
        double totalDescontos = (percentDesconto/100) * salarioBase;
        double salarioLiquido = salarioBase - totalDescontos;

        System.out.println("Salário base : R$ " + salarioBase);
        System.out.println("Salário Liquido : R$ " + salarioLiquido);


    }
}
