package LivroAlgaWorks;

import java.util.Scanner;

public class EstruturaDeDecisao {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("===================================");
        System.out.print("Informe o preço do produto: R$");
        double precoProduto=scanner.nextDouble();

        boolean valorInflacionado = precoProduto >=50;
        double valorDesconto = 5.0;

        if(valorInflacionado){
            double aplicarDesconto = (precoProduto * valorDesconto) / 100;
            double valorTotal = precoProduto - aplicarDesconto;
            System.out.println("Valor do produto com desconto de 5% ficou:  R$" + valorTotal);
        } else{
            System.out.println("Sobrou nada pro beta vou ter que pagar: "+  precoProduto);
        }









    }
}
