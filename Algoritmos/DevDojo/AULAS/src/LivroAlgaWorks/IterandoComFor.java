package LivroAlgaWorks;

public class IterandoComFor {
    public static void main(String[] args) {
        double []carrinhoDeCompras = new double[] {10.50,20.99,100.99};
        double valorTotalCarrinho = 0;
        for (int i = 0; i < carrinhoDeCompras.length; i++){
            valorTotalCarrinho += carrinhoDeCompras[i];
            System.out.println("Iteração: N°" + i);
            System.out.println("Valor total do item: " + i + " é: R$"+ valorTotalCarrinho);
        }
        System.out.println("Valor total do carrinho: R$"+valorTotalCarrinho);
    }
}
