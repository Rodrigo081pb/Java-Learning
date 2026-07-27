package ControleDeFluxo;

public class Aula2 {
    public static void main(String[] args) {
        double salario = 4700.50;

        if(salario > 4500){
            double porcentagemDoSalario = salario * 30 / 100 ;
            System.out.printf("30 por cento do seu salário %s é: %.1f %n", salario, porcentagemDoSalario);
        } else {
            double porcentagemDoSalario = salario * 15 / 100 ;
            System.out.printf("15 por cento do seu salário %s é: %.1f %n", salario, porcentagemDoSalario);
        }

        // desafio 1 : utilize apenas uma variável para guardar o resulado e imprimir apenas no final

        float salario2 = 4700.50F;
        float resultado = 0F;

        if(salario2 > 4500){
            resultado = salario2 * 0.3F;
        } else {
            resultado = salario2 * 0.1F;
        }

        System.out.println(resultado);


        // Desafio 2 : Diga na impressão se é 30% ou 10%
        float salario3 = 4700.50F;
        float resultado3 = 0F;
        String porcentagemMaster = "";

        if(salario3 > 4500){
            resultado3 = salario3 * 0.3F;
            porcentagemMaster = "30%";
        } else {
            resultado3 = salario3 * 0.1F;
            porcentagemMaster = "15%";
        }

        System.out.println("R$"+resultado3 + " isso é: " + porcentagemMaster + " do salário");



    }
}
