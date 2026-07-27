package Exercicios.OperadoresAritmeticos;

public class ReutilizacaoDeVariaveis  {

    public static void main(String[] args) {
        double salario = 5000;
        double porcentagem1= 30;
        double porcentagem2= 15;
        double porcentagem3= 5;

        double porcentagemDoSalario = salario * porcentagem1 / 100 ;
        System.out.println(porcentagemDoSalario);
        double porcentagemDoSalario2 = salario * porcentagem2 / 100 ;
        System.out.println(porcentagemDoSalario2);
        double porcentagemDoSalario3 = salario * porcentagem3 / 100 ;
        System.out.println(porcentagemDoSalario3);

    }

}
