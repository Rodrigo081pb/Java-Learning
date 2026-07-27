package Exercicios.LacosDeRepeticao.For;

public class CalcularDesconto {
    public static void main(String[] args) {

        double valorSalario = 2500;
        double descontoSalario = 0.30 * 100;

        double salarioLiquido = valorSalario - descontoSalario;

        System.out.println(salarioLiquido);

        // Agora se eu quiser saber a quantos % de um salario representa
        // exemplo 50% do salario do cara, nesse sentido

        double numeroPorcentagem = 35;
        double porcentagemDoSalario = valorSalario * numeroPorcentagem / 100 ;

        System.out.println(porcentagemDoSalario);

    }
}
