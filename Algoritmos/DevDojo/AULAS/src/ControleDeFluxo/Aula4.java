package ControleDeFluxo;

public class Aula4 {
    public static void main(String[] args) {
        // o objetivo aqui é criar uma boa lógica entre operadores

        // desafio: calcule o imposto de renda de um determinado salario de acordo com a tabela do IR

        double salario = 3200;
        if (salario == 3036){
            System.out.println("você tá isento do IR");
        } else if( salario >= 3036 && salario <= 3533.31){

            double aliquota = 7.5 / 100;
            float parcelaDeduzir = 182.16F;
            double calculoIr = salario * aliquota;
            calculoIr = calculoIr -  parcelaDeduzir;
            double salarioLiquido = Math.round(salario - calculoIr) ;
            System.out.printf("Seu salário líquido com o desconto de imposto de renda ficou: R$%.2f",salarioLiquido);
        }
        else if( salario >= 3533.31 && salario <= 4688.85){

            double aliquota = 15 / 100 ;
            float parcelaDeduzir = 394.16F;
            double calculoIr = salario * aliquota;
            calculoIr = calculoIr -  parcelaDeduzir;
            double salarioLiquido = Math.round(salario - calculoIr) ;
            System.out.printf("Seu salário líquido com o desconto de imposto de renda ficou: R$%.2f",salarioLiquido);

        } else if( salario >= 3751.06 && salario <= 4664.68){

            double aliquota = 22.5 / 100;
            float parcelaDeduzir = 675.49F;
            double calculoIr = salario * aliquota;
            calculoIr = calculoIr -  parcelaDeduzir;
            double salarioLiquido = Math.round(salario - calculoIr) ;
            System.out.printf("Seu salário líquido com o desconto de imposto de renda ficou: R$%.2f",salarioLiquido);

        } else if (salario >= 5830.85) {

            double aliquota = 27.5 / 100;
            float parcelaDeduzir = 908.73F;
            double calculoIr = salario * aliquota;
            calculoIr = calculoIr -  parcelaDeduzir;
            double salarioLiquido = Math.round(salario - calculoIr) ;

            System.out.printf("Seu salário líquido com o desconto de imposto de renda ficou: R$%.2f",salarioLiquido);
        }
    }
}
