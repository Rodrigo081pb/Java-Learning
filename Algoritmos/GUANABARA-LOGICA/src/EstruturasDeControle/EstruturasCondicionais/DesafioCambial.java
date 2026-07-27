package EstruturasDeControle.EstruturasCondicionais;

import java.util.Scanner;

class Cambio {

    // função de taxa de cambio que recebe o valor que o usuário irá digitar e
    // ira fazer a conversão de acordo com o tipo de operação que ele quer resolver
    // exemplo D de dollar e E de euro

    public void AplicarCambio(){

        Scanner opcao = new Scanner(System.in);
        System.out.println("=================");
        System.out.println("      MENU       ");
        System.out.println("=================");
        System.out.println("Olá bem-vindo!"                     );
        System.out.println("                                   ");
        System.out.println("Qual taxa de cambio pretende usar: ");
        System.out.println("E = EURO: ");
        System.out.println("D = DOLAR: ");
        String operacao = opcao.nextLine();
        double saldoTotal;
        if (operacao.equals("E")) {
            double cotacaoEuro = 5.83;
            System.out.println("A taxa cambial do real para o euro é de:  ");
            System.out.println("1 Euro = 5,83 Real Brasileiro");
            System.out.println("=============================");
            System.out.println("Insira o valor que possui:   ");

            double valorReal = (int)opcao.nextDouble();
            if(valorReal < cotacaoEuro){
                System.out.println("você não possui saldo suficiente para continuar a operação");
            } else {
                saldoTotal =  valorReal/cotacaoEuro;
                System.out.printf("Parabéns agora você possui: %.2f EUROS", saldoTotal );
            }
        } else if (operacao.equals("D")) {
            double cotacaoDolar = 5.11;
            System.out.println("A taxa cambial do Real para o Dólar é de:  ");
            System.out.println("1 dolár = 5,11 Real Brasileiro");
            System.out.println("=============================");
            System.out.println("Insira o valor que possui:   ");

            double valorReal = (int)opcao.nextDouble();
            if(valorReal < cotacaoDolar){
                System.out.println("você não possui saldo suficiente para continuar a operação");
            } else {
                saldoTotal =  valorReal/cotacaoDolar;
                System.out.printf("Parabéns agora você possui: %.2f EUROS ", saldoTotal );
            }
        }
    }
}


public class DesafioCambial extends Cambio {
    /*
    Desafio proposto: fazer uma taxa cambial de real para Dolar ou Euro:

    Informações:

    Taxa de conversão atual de acordo com a cotação

    1 Dólar (EUA) = 5,11 Real Brasileiro
    1 Euro = 5,83 Real Brasileiro

    você irá perguntar ao usuário quanto ele deseja trocar e logo em seguida vai iniciar
    a troca deve verificar se o valor que o usuário possui é suficiente para realizar o cambio

     */

    public static void main(String[] args){

        Cambio cambio = new Cambio(); // criação de um objeto
        cambio.AplicarCambio(); // chamando o objeto para execução do mesmo

    }

}


