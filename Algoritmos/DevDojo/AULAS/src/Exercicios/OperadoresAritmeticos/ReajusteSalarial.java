package Exercicios.OperadoresAritmeticos;

public class ReajusteSalarial {
    public static void main(String[] args) {
        /*
        * Novo Salario = Salario base + (salario base * percentual de reajuste) / 100
        * */

        double salarioBase = 1518.60;
        double percentualReajuste = 0.5 * 100; // reajuste de 5%
        double novoSalario = salarioBase + (salarioBase * percentualReajuste) / 100;
        System.out.println("Seu antigo salário era de R$" + salarioBase);
        System.out.println("Seu novo salário é de R$" + Math.round(novoSalario));
    }
}
